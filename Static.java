class Student{
    int roll;
    String name;
    static String college="SPoorthy";
    public Student(int r,String n){
        roll=r;
        name=n;
    }
    static void change(){
        college="sri Indu";
    } 
    public void display(){
        System.out.println(college);
    }
}
public class Static {
    public static void main(String[] args) {
        Student s1=new Student(12 ,"Spoo");
        System.out.println(s1.college);
        Student.change();
        s1.display();
    }
}
