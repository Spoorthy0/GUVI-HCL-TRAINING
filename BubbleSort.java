public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        boolean isSwapped;
        for(int i=0;i<n-2;i++){
            isSwapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }

            }
            if(!isSwapped) break;

        }

    }
    public static void main(String[] args) {
        int arr[]={64,34,25,12,22,11,9};
        System.out.println("Array before sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        bubbleSort(arr);
        System.out.println("Array after sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }

    }

}
