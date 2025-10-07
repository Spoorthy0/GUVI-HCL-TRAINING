
import java.util.ArrayList;
import java.util.List;


class Student{
    String name;
    int marks;
    public Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}
public class StreamProject2 {
    public static void main(String[] args){
        List<Student> students=new ArrayList<>();
        students.add(new Student("Spoorthy",98));
        students.add(new Student("Archana",99));

       System.out.println( students.stream().filter(e->(e.marks>90)).map(e->e.name).toList());
        




    }
    
}
