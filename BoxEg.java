class Box{
    private int height;
    private int width;
    private int breadth;
    public Box(int height,int breadth,int width){
        this.height=height;
        this.width=width;
        this.breadth=breadth;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int volume(){
        return this.height*this.breadth*this.width;
    }

}
public class BoxEg {
     public static void main(String[] args) {
         Box b=new Box(2,2,2);
         System.out.println("The volume is "+b.volume());
         b.setHeight(3);
         b.setBreadth(2);
         b.setWidth(1);
         System.out.println("The volume is "+b.volume());
     }
}
