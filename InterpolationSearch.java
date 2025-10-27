public class InterpolationSearch {
     public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int target=5;
        int result=interpolationSearch(arr,0,n-1,target);
        System.out.println(result);
    }
    public static int interpolationSearch(int[] arr,int start,int end,int target){
        int pos;
        if(start<=end &&  target >=arr[start] && target<=arr[end]){
            pos= start+(((end-start)/(arr[end]-arr[start])) * (target-arr[end]));
            if(arr[pos]==target) return pos;
            if(arr[pos]>target) return interpolationSearch(arr, start, pos-1, target);
            if(arr[pos]<target) return interpolationSearch(arr, pos+1, end, target);
        }
      return -1;
    }
}
