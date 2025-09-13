class Rectangles{
    private int length;
    private int breadth;
    public Rectangles(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int area(){
        return length*breadth;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}
class Cuboid extends Rectangles{
    private int height;
    public Cuboid(int length,int breadth,int height){
        super(length,breadth);
        this.height=height;
    }
    public int area(){
        return 2*(super.area()+height*getLength()+height*getBreadth());
    }
    public int volume(){
        return super.area()*height;
    }
}
public class Rectangle {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(5, 10, 15);
        System.out.println(c.area());
        System.out.println(c.volume());
    }
}

