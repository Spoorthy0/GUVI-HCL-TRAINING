public class CountingSort {

    public static void countSort(int[] arr){
       int n=findMax(arr);
       int[] freq=new int[n+1];
       for(int ele:arr){
        freq[ele]++;
       }
       int k=0;
       for(int i=0;i<freq.length;i++){
        for(int j=0;j<freq[i];j++){
            arr[k++]=i;
        }
       }
    }
    public static int findMax(int[] arr){
        int maxEle=0;
        for(int ele:arr){
            if(ele>maxEle){
                maxEle=ele;
            }
        }
        return maxEle;

    }
    public static void main(String[] args) {
        int arr[]={64,34,25,12,22,11,9};
        int n=arr.length;
        System.out.print("Array before sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        countSort(arr);
        System.out.print("Array after sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

}
