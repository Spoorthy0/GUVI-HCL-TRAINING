import java.io.Serializable;
import java.io.*;
class Student implements Serializable{
    private static long serialVersionUID=1L;

    String name;
    int age;
    String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public String toString(){
        return "Name: "+name+", Age: "+age+", Grade: "+grade;
    }
}
public class SerialiZationAndDeserializationDemo {
    public static void main(String args[]) {
        Student student=new Student("Alice",20,"A");
        Student student1=new Student("SPorthy",21,"3");
        //System.out.println(student);
        String fileName="students.ser";
        try(FileOutputStream fileOut=new FileOutputStream(fileName);
            ObjectOutputStream out=new ObjectOutputStream(fileOut)) {
                out.writeObject(student);
                out.writeObject(student1);
                System.out.println("Serialized data is saved in "+fileName);
        } catch (Exception e) {
            System.out.println("An error occured during serialization: "+e.getMessage());
        }
    }
}
    

