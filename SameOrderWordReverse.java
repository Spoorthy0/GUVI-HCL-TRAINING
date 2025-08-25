
import java.util.Scanner;

public class SameOrderWordReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int end=str.length();
        // for(int i=end-1;i>-1;i--){
        //     if(str.charAt(i)==' '){
        //         Reverse(str.substring(i+1, end));
        //         end=i;
        //     }
        // }
        // System.out.print(str.substring(0,end));
        int begin=0;
        for(int i=0;i<end;i++){
            if(str.charAt(i)==' '){
                Reverse(str.substring(begin,i));
                begin=i+1;
            }
        }
       Reverse(str.substring(begin));
        
    }
        public static void Reverse(String str){
        String revStr="";
        int right=str.length()-1;
        while(right>=0){
            revStr+=str.charAt(right);
            right--;
        }
        System.out.print(revStr+" ");
    }
}
