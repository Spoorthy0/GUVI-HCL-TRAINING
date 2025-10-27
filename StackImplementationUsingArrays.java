public class StackImplementationUsingArrays {
    int top;
    int size;
    int[] stack;
    public StackImplementationUsingArrays(int size){
        this.size=size;
        stack=new int[size];
        top=-1;
    }

    //push operation
    void push(int data){
        if(top==size-1){
            System.out.println("Stack overflow");
        }
        else{
            stack[++top]=data;
            System.out.println("Pushed Element: "+data);

        }
    }
    
    //pop operation
    void pop(){
        if(top==-1){
            System.out.println("Stack undeflow");
        
        }
        else{
            System.out.println("Popped Element: "+stack[top--]);
        }
    }
    public static void main(String[] args) {
        StackImplementationUsingArrays stack=new StackImplementationUsingArrays(3);
        stack.push(1);
        stack.push(67);
        stack.push(21);
        stack.push(7);
        stack.pop();

    }
}
