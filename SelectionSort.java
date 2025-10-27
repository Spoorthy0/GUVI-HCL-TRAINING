public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={64,34,25,12,22,11,9};
        System.out.println("Array before sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        selectionSort(arr);
        System.out.println("Array after sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=i;
                }
            }
        }
    }
}
