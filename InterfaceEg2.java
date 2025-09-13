 abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disConnected();
}
class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("Ringing..");
    }
    public void lift(){
        System.out.println("Lifting");
    }
    public void disConnected(){
        System.out.println("Disconnected..");
    }
}
public class InterfaceEg2{
    public static void main(String args[]){
        SmartTelephone sp1=new SmartTelephone();
        sp1.ring();
        sp1.lift();
        sp1.disConnected();
    }

}