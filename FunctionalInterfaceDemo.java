@FunctionalInterface
interface Animal{
    void sound();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Barking..");
    }
}
 public class FunctionalInterfaceDemo{
     public static void main(String args[]){
        Animal a=()->System.out.println("Barks..");
        a.sound();
        Dog d=new Dog();
        d.sound();
     }
}