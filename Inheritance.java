class GrandFather{
        public GrandFather(){
            System.out.println("Constructor of grandFather");
        }
        public void show1(){
            System.out.println("grandFather class");
        }
    }
    class Father extends GrandFather{
        public Father(){
            System.out.println("Constructor of Father");
        }
        public Father(int x){
            System.out.println("para const of father"+x);
        }
        public void show(){
            System.out.println("father class");
        }
    }
    class Son extends Father{
        public Son(){
            super();
            System.out.println("Default son");
        }
        public Son(int x){
            super(x);
            System.out.println("Para cons of son "+x);
        }
        public void show(){
            System.out.println("Son class");
        }
    }
    public class Inheritance{
    public static void main(String[] args) {
        Son obj=new Son();
        //obj.show1();

    }
}
