import java.util.LinkedList;
import java.util.Scanner;

@SuppressWarnings("unused")
class StudentManager {
    private LinkedList<Student> students;

    public StudentManager() {
        students = new LinkedList<>();
    }

    public void addStudent(String id, String name, double score) {
        Student student = new Student(id, name, score);
        students.add(student);
        System.out.println("Added student: " + student);
    }

    public Student findStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(String id, String name, double score) {
        Student student = findStudentById(id);
        if (student != null) {
            students.remove(student);
            students.add(new Student(id, name, score));
            System.out.println("Updated student: " + student);
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(String id) {
        Student student = findStudentById(id);
        if (student != null) {
            students.remove(student);
            System.out.println("Deleted student: " + student);
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("Student List:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
