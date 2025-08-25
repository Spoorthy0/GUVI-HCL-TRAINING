import java.util.Scanner;

public class ConsonantsandVowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        Count(str.toLowerCase());

    }
    public static void Count(String str){
        int vowels=0,consonants=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if("aeiou".indexOf(ch)!=-1){
                vowels++;
            }
            else if(ch>='a' && ch<='z'){
                consonants++;
            }


        }
        System.out.print("Vowels count : "+vowels+" Consonants count : "+consonants);
    }
}
