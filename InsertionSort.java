public class InsertionSort {
public static void main(String[] args) {
        int arr[]={64,34,25,12,22,11,9};
        System.out.print("Array before sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        insertionSort(arr);
        System.out.print("Array after sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }
    }
}
