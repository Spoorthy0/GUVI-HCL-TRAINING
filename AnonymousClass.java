 class Car{
    public void run(){
        System.out.println("Running");
    }
}
public class AnonymousClass{
    public static void main(String args[]){
        Car c=new Car(){
            public void run(){
                System.out.println("Running..");
            }
        };
        c.run();

    }
}