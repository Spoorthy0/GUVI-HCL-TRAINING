
interface Bicycle{
    static void changeTire(){
        System.out.println("Changed");
    }
    void applyBreak(int decrement);
    void speedUp(int increment);
}
// interface Cycle extends Bicycle{
//     static void changeTire(){
//         System.out.println("Changed cycle");
//     }
// }

interface HornBike extends Bicycle{
    void on();
    void off();
}
class Duke implements HornBike{
     int speed=10;
     public void applyBreak(int decrement){
        this.speed-=decrement;
        System.out.println("Speed after applying break is "+this.speed);
     }
     public void speedUp(int speed){
        this.speed+=speed;
        System.out.println("Speed increased by "+this.speed);
     }
     public void on(){
        System.out.println("On");
     }
     public void off(){
        System.out.println("Off");
     }
    //  public void speedUp(int incre){
    //     System.out.println("Started");
    //  }
}
public class InterfaceDemo {
    public static void main(String args[]){
        Duke d1=new Duke();
        d1.applyBreak(10);
        d1.speedUp(20);
        d1.on();
        d1.off();
        Bicycle.changeTire(); //static method access
 
    }
}
