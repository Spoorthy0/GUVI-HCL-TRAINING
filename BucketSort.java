
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void bucketSort(float[] arr){
        int n=arr.length;
        List<Float>[] buckets=new ArrayList[n];
        for(int i=0;i<n;i++){
            //initialize each bucket
            buckets[i]=new ArrayList<Float>();
        }

        for(int i=0;i<n;i++){
            int idx=(int)arr[i] *n;
            buckets[idx].add(arr[i]);
        }

        for(int i=0;i<n;i++){
            Collections.sort(buckets[i]);
        }
        int index=0;
        for(int i=0;i<n;i++){
            for(float ele:buckets[i]){
                arr[index++]=(int)ele;
            }
        }

    }
    public static void main(String[] args) {
        float arr[]={0.42f,0.32f,0.23f,0.52f,0.25f,0.47f,0.51f};
        int n=arr.length;
        System.out.print("Array before sort: ");
        for(float i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        bucketSort(arr);
        System.out.print("Array after sort: ");
        for(float i:arr){
            System.out.print(i+" ");
        }
    }
}
