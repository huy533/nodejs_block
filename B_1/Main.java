import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Score: ");
                    double score = scanner.nextDouble();
                    manager.addStudent(id, name, score);
                    break;
                case 2:
                    System.out.print("Enter ID to update: ");
                    id = scanner.nextLine();
                    System.out.print("Enter new Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new Score: ");
                    score = scanner.nextDouble();
                    manager.updateStudent(id, name, score);
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    id = scanner.nextLine();
                    manager.deleteStudent(id);
                    break;
                case 4:
                    manager.displayStudents();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


