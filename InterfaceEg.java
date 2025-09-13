interface Wifi{
    void useWifi();
}
interface GPS{
    void useGPS();
}
interface DataNet extends Wifi,GPS{
    void useData();
}
class Phone{
    public void call(){
        System.out.println("Calling..");
    }
}
class Samsung extends Phone implements DataNet{
    public void useWifi(){
        System.out.println("Using wifi");
    }
    public void useGPS(){
        System.out.println("Using GPS");
    }
    public void useData(){
        System.out.println("using Data");
    }
}
public class InterfaceEg{
   public static void main(String args[]){
      Phone p1=new Samsung();
      p1.call();
      //p1.useGPS();
      Samsung s1=new Samsung();
      s1.call();
      s1.useWifi();
   }
}