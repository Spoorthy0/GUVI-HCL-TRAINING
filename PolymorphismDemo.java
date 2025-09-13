class Animal {
    public void sound() {
        System.out.println("Animal makes a sound...!!!");
    }
}
class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks...!!!");
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();
    }
}
