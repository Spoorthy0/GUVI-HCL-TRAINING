public class JumpSearch {
     public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=4;
        int result=jumpSearch(arr,target);
        System.out.println(result);
    }
    public static int jumpSearch(int[] arr,int target){
        int n=arr.length;
        int blocksize=(int)Math.sqrt(n);
        int start=0;
        int end=blocksize;
        while(end<n && arr[end]<=target){
            start=end;
            end+=blocksize;
            if(end>n) end=n;
        }
        int result=-1;
        for(int i=start;i<end;i++){
            if(arr[i]==target) return i;
        }

        return -1;
    }
}
