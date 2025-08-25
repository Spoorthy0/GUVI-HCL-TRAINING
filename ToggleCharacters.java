
import java.util.Scanner;

public class ToggleCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        toggleCase(str);
    }
    public static void toggleCase(String str){
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<sb.length();i++){
            boolean flag=true;
            char ch=sb.charAt(i);
            int ascii=(int)ch;
            if(ascii>=97){
                flag=false;
                ascii-=32;
                char newCh=(char)ascii;
                sb.setCharAt(i, newCh);

            }
            else{
                ascii+=32;
                char newCh=(char)ascii;
                sb.setCharAt(i, newCh);

            }

        }
        System.out.print(sb);
    }
}
