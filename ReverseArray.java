public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        // int start=0;
        // int end=arr.length-1;
        // while(start<end){
        //     int temp=arr[start];
        //     arr[start]=arr[end];
        //     arr[end]=temp;
        //     start++;
        //     end--;
        // }
        // for(int i:arr){
        //     System.out.print(i+" ");
        // }

        // for(int i=0;i<arr.length/2;i++){
        //     int temp=arr[i];
        //     arr[i]=arr[arr.length-1-i];
        //     arr[arr.length-1-i]=temp;
        // }
        // for(int i:arr){
        //     System.out.print(i+" ");
        // }

         int[] arr2=new int[5];
        // int start=0;
        // int end=arr.length-1;
        // while(start<=end){
        //     int temp=arr[start];
        //     arr2[start]=arr[end];
        //     arr2[end]=temp;
        //     start++;
        //     end--;
        // }
        // for(int i:arr2){
        //     System.out.print(i+" ");
        // }

        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            arr2[arr.length-1-i]=temp;
        }
        for(int i:arr2){
            System.out.print(i+" ");
        }

    }
}
