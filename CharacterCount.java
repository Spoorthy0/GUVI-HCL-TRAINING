import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int freq[]=new int[257];
        for(char c:str.toCharArray()){
            freq[c]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.print((char)(i)+" : "+freq[i]+" ");
            }
        }
    }
}
