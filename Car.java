class Cars{
  private int wheels;
  private String light;
  private String color;
  private int size;
  public void setCar(int wheels,String light,String color,int size){
         this.wheels=wheels;
         this.light=light;
         this.color=color;
         this.size=size;
  }
  public int getWheels(){
    return wheels;
  }
  public String getLight(){
    return light;
  }
  public String getColor(){
    return color;
  }

  public Cars(){
      this.wheels=4;
  }

}
public class Car {
   public static void main(String[] args) {
       Cars c1=new Cars();
       Cars c2=new Cars();
       Cars c3=new Cars();
       Cars c4=new Cars();
       System.out.println(c1.getWheels());

   }
    
}
