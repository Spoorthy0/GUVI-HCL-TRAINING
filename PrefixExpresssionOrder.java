import java.util.Stack;

public class PrefixExpresssionOrder {
    static int precedence(char c){
        if(c=='^') return 3;
        else if(c=='*' || c=='/') return 2;
        else if(c=='+' || c=='-') return 1;
        else return -1;
    }
    static String changeToPostFix(String exp){
        Stack<Character> stack=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(c>='a' && c<='z' || c>'A' && c<='Z' || c>='0' && c<='9'){
                res.append(c);
            } else if(c==')'){
                while(!stack.isEmpty() && stack.peek()!=')'){
                    res.append(stack.pop());
                }
            }
            else{
                while(!stack.isEmpty() && stack.peek()!='(' && (precedence(stack.peek())>precedence(c) || precedence(stack.peek())==precedence(c))){
                    res.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String exp="(23)*5-8/4";
        System.out.println("Postfix expression is:" + changeToPostFix(exp));

    }
} 