public class StringReverse {
    public static void Reverse(String str){
        // String revStr="";
        // int right=str.length()-1;
        // while(right>=0){
        //     revStr+=str.charAt(right);
        //     right--;
        // }
        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse());

        //return str;
       // System.out.println("Reversed String: " + revStr);

    }

    public static void main(String[] args) {
        String name=new String("Spoorthy");
        Reverse(name);
        //String reversedName = Reverse(name);
        //System.out.println("Reversed String: " + reversedName);
    }
}
