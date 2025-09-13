class Monkey{
   public void jump(){
    System.out.println("Jumping..");
   }
   public void bite(){
    System.out.println("Biting");
   }
}
interface Animal{
   void eat();
   void sleep();
}
class Human extends Monkey implements Animal{
   public void eat(){
    System.out.println("Eating..");
   }
   public void sleep(){
    System.out.println("Sleeping..");
   }
}
public class InterfaceMonkeyEg{
    public static void main(String args[]){
       Human h1=new Human();
       h1.jump();
       h1.eat();
       h1.sleep();
       h1.bite();
    }
   
}