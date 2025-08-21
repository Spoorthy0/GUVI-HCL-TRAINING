

public class ArrayDemo {
    
    public static void main(String[] args) {
        int num[]={1,2,3};
        String names[]={"Spoorthy","Archana","Rakesh"};

        int marks[]=new int[4];

        marks[0]=20;
        marks[1]=20;
        marks[2]=20;
        marks[3]=20;
        // for(int i:marks){
        //     System.out.println(i+" ");
        // } 

        //Sum of Elements

        // int sum=0;
        // for(int i:marks){
        //     sum+=i;
        // }
        // System.out.println(sum);

        // int max=0;
        // for(int i:num){
        //     if(max<i)
        //       max=i;
        // }
        // System.out.println("The max value is : "+max);

        // int target=3;
        // for(int i=0;i<num.length;i++){
        //     if(num[i]==target){
        //         System.out.println("Found target at index: "+i);
        //     }
        // }

        int max=0;
        int secondMax=0;
        // for(int i=0;i<num.length;i++){
        //     if(num[i]>max){
        //         max=num[i];
        //     }
        // }
        // for(int i=0;i<num.length;i++){
        //     if(num[i]>secondMax && num[i]<max){
        //         secondMax=num[i];
          
        //   }
        // }
        // System.out.println(max);
        // System.out.println(secondMax);

        for(int i:num){
            if(i>max){
                secondMax=max;
                max=i;
            }else if(i>secondMax && i<max){
                secondMax=i;
            }
        }
        System.out.println(secondMax);

    
    }
}
