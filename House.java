public class House {
    String color;
    int price;
    boolean isGoodInterior;
    public House(String color,int price,boolean isGoodInterior){
        this.color=color;
        this.price=price;
        this.isGoodInterior=isGoodInterior;
    }
    void doorOpen(){
        System.out.println("Door is Open");
    }
    void doorClosed(){
        System.out.println("Door is Closed");
    }
        
    public String toString() {
        return "Color :"+color+" , Price : "+price+" , isGoodInterior : "+isGoodInterior;
    
    }
    
}
