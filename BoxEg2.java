class Box{
    int height;
    int width;
    int depth;
    Box(){
        height=10;
        width=10;
        depth=10;
    }
    Box(int h,int w,int d){
        height=h;
        width=w;
        depth=d;
    }
    Box(int h){
        height=h;
    }
    Box(Box b){
        height=b.height;
        width=b.width;
        depth=b.depth;
    }
    public void vol(){
        System.out.println("The volume is "+(height*width*depth));
    }
}
public class BoxEg2 {
    public static void main(String[] args) {
        Box b=new Box();
        b.vol();
        Box b1=new Box(2,3,4);
        b1.vol();
        Box b2=new Box(b);
        b2.vol();
        Box b3=new Box(5);
        b3.vol();
    }
}
