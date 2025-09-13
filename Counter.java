class Count{
    static int count;
    static int incrementAndGetCount(){
          count+=1;
          return count;
    }
}
public class Counter{
  public static void main(String[] args) {
      System.out.println("1st time:"+Count.incrementAndGetCount());
      System.out.println("2nd time:"+Count.incrementAndGetCount());
      System.out.println("3rd time:"+Count.incrementAndGetCount());
      System.out.println("4th time:"+Count.incrementAndGetCount());

  }
}