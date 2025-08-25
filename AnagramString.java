
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=sc.next();
         boolean isAnagram=isAnagram(str,str1);
        if(isAnagram){
            System.out.println(str+" and "+str1+" are Anagram");
        }
        else{
            System.out.println(str+" and "+str1+" are not Anagram");
        }

    }
    public static boolean isAnagram(String str,String str1){
        if(str.length()!=str1.length()){
            return false;
        }
        else{
        //     char[] arr=str.toCharArray();
        //     char[] arr1=str1.toCharArray();

        //     Arrays.sort(arr);
        //     Arrays.sort(arr1);
        //     if(Arrays.equals(arr,arr1)){
        //         return true;
        //     }

        int[] freq=new int[257];
         for(char c:str.toCharArray()){
            freq[c]++;
         }
         for(char c: str1.toCharArray()){
            freq[c]--;
         }
         for(int f:freq){
            if(f!=0){
               return false;
            }
         }

        return true;
    }
}
}

