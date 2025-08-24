public class PalindromeString {
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
        while(str.charAt((left))!=str.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
        return true;
        
    }
    public static void main(String[] args) {
        String str=new String("archana");
        if(isPalindrome(str)){
            System.out.println(str+" is Palindrome");

        }
        else{
            System.out.println(str+" is not a palindrome");
        }
    }
    
}
