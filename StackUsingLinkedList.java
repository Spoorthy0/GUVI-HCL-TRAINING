public class StackUsingLinkedList {
    Node top;
    int size;

    public StackUsingLinkedList() {
        this.size = 0;
        this.top = null;
    }

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // push operation
    void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
        System.out.println("Pushed Element: " + data);
    }

    // pop operation
    void pop() {
        if (top == null) {
            System.out.println("Stack underflow");
        } else {
            System.out.println("Popped Element: " + top.data);
            top = top.next;
            size--;
        }
    }
    void peek(){
        if(top==null){
            System.out.println("Stack is empty");

        }
        else{
            System.out.print("Top Element:"+top.data);
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.pop();
        stack.pop();
        //stack.pop(); // This will show underflow
        stack.peek();
    }
    
}
