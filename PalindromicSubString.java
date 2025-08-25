
import java.util.Scanner;

public class PalindromicSubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        SubString(str);
    }
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        if(left<right){
        while(str.charAt((left))!=str.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
        return true;

    }
     public static void SubString(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(isPalindrome(str.substring(i, j))){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
