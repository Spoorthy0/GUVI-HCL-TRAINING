public class RadixSort {

    public static void radixSort(int[] arr){
        int n=arr.length;
         int maxi=findMax(arr);
         for(int exp=1;maxi/exp>0;exp*=10){
            stableCountSort(arr,n,exp);

         }

    }
    public static void stableCountSort(int[] arr,int n,int exp){
        int output[] =new int[n];
        int maxi=findMax(arr);
        int[] freq=new int[10];
        for(int i=0;i<n;i++) freq[i]=0;
        for(int i=0;i<n;i++){
            freq[(arr[i]/exp)%10]++;
        }


        for(int i=1;i<freq.length;i++){
            freq[i]+=freq[i-1];
        }

        //find index of each array and place it in output array
        for(int i=n-1;i>=0;i--){
            int digit=(arr[i]/exp)%10;
            output[freq[digit]-1]=arr[i];
            freq[digit]--;

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
        int arr[]={107,81,24,3,225};
        int n=arr.length;
        System.out.print("Array before sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        radixSort(arr);
        System.out.print("Array after sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
