abstract class Pen{
   abstract void write();
   abstract void refill();
}
class FountainPen extends Pen{
    public void write(){
        System.out.println("Writing");
    }
    public void refill(){
        System.out.println("Refilling");
    }
    public void Nib(){
        System.out.println("Nib od a pen");
    }
}
public class AbstractionEg{
    public static void main(String args[]){
        FountainPen f1=new FountainPen();
        f1.write();
        f1.refill();
        f1.Nib();

    }

}