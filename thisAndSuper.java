class Student{
    String name;
    public Student(String name){
        this.name=name;
}
   public String getName(){
    return name;
   }
}
public class thisAndSuper {
    public static void main(String[] args) {
        Student s1=new Student("Spoorthy");
        System.out.println(s1.getName());
    }
}
