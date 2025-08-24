

public class StringReverse {
    public static String Reverse(String str){
        // String revStr="";
        // int right=str.length()-1;
        // while(right>=0){
        //     revStr+=str.charAt(right);
        //     right--;
        // }
        int left=0;
        int right=str.length()-1;
        while(left<=right){
            char temp=str.charAt(left);
        

            left++;
            right--;


        }
        return str;
       // System.out.println("Reversed String: " + revStr);

    }

    public static void main(String[] args) {
        String name=new String("Spoorthy");
        String reversedName = Reverse(name);
        System.out.println("Reversed String: " + reversedName);
    }
}
