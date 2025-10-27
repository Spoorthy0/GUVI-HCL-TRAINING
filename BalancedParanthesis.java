import java.util.Stack;

public class BalancedParanthesis {
    static boolean balancedParentheses(String exp){
        Stack<Character> stack=new Stack<>();
        for(char c:exp.toCharArray()){
            if(c=='(' || c=='{'|| c=='['){
                stack.push(c);
            }
            else if(c==')' || c=='}' || c==']'){
                if(stack.isEmpty()) return false;
                char top=stack.peek();
                if(c==')' && top!='(' || c=='}' && top!='{' || c==']' && top!='['){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String exp="(({{{}[]}})())";
        if(balancedParentheses(exp)){
            System.out.println("The entered String has Balanced Parentheses");
        }
        else{
            System.out.println("The entered Strings do not contain Balanced Parentheses");
        }
        
    }
}
