public class StableCountingSort {

    public static void stableCountSort(int[] arr){
        int n=arr.length;
        int output[] =new int[n];
        int maxi=findMax(arr);
        int[] freq=new int[maxi+1];
        for(int ele:arr){
            freq[ele]++;
        }

        //Prefix sum array of freq array
        for(int i=1;i<freq.length;i++){
            freq[i]+=freq[i-1];
        }
        //find index of each array and place it in output array
        for(int i=n-1;i>=0;i--){
            int idx=freq[arr[i]]-1;
            output[idx]=arr[i];
            freq[arr[i]]--;

        }
        //copy all elements of ouput arr to arr
        for(int i=0;i<n;i++){
            arr[i]=output[i];
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
        int arr[]={0,4,3,1,2,5,4,1,5,3};
        int n=arr.length;
        System.out.print("Array before sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        stableCountSort(arr);
        System.out.print("Array after sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
