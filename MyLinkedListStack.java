import java.util.ArrayList;

public class MyLinkedListStack implements IStackQueue{
    private class Node{
        int value;
        Node next;
        Node (int value){
            this.value = value;
        }
    }
    Node topNode;
    MyLinkeListStack(){
        topNode = null;
    }
    @Override
    public boolean push(int value){
        if(!isFull()){
            Node newNode = new Node(value);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }
    @Override
    public int pop(){
        if(isEmpty())
        return - 1;
        int value = topNode.value;
        topNode = topNode.next;
        return value;
        
    }
    @Override 
    public boolean isFull(){
        return false;
    }
    @Override 
    public boolean isEmpty(){
        return topNode == null;
    }
    @Override 
    public void show(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        Node temp = topNode;
        ArrayList<Integer>temList = new ArrayList<>();
        while (temp != null) 
        {
            temList.add(temp.value);
            temp = temp.next;  
        }
        for(int i=temList.size() - 1; i>= 0; i--){
            System.out.println(temList.get(i)+"");
        }
        System.out.println();
    }
}