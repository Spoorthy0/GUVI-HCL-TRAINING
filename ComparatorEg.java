
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person{
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "Person{name= '" +name +"' ,Age : "+age+ '}';
    }
}
public class ComparatorEg {
  public static void main(String[] args) {
      ArrayList<Person> people=new ArrayList<>();
      people.add(new Person("Spoorthy", 21));
      people.add(new Person("Archana", 20));

      Collections.sort(people,new Comparator<Person>(){

        public int compare(Person p1,Person p2){
          int ageCom=Integer.compare(p1.age, p2.age);
          if(ageCom!=0){
            return ageCom;
          }
          return p1.name.compareTo(p2.name);
        }

      });
      System.out.println("Sorted People :" + people);

      

  }    
}
