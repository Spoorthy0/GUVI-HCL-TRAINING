interface smartTvremote{
  void smartTv();
}
interface TVRemote extends smartTvremote{
   void remote();
}
class TV implements TVRemote{
    public void smartTv(){
        System.out.println("Smart TV");
    }
    public void remote(){
        System.out.println("Remote");
    }
}
public class InterfaceEg3{
    public static void main(String args[]){
        TV tv1=new TV();
        tv1.smartTv();
        tv1.remote();

    }

}