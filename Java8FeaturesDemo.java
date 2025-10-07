
import java.util.ArrayList;
import java.util.List;





public class Java8FeaturesDemo {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Spoorthy");
        names.add("Archana");
        names.add("Anusha");
        names.stream().filter(n->n.contains("h")).map(n->n.toUpperCase()).forEach(n->System.out.println(n));

        List<Integer> nums=new ArrayList<>();
        nums.add(3);
        nums.add(50);
        nums.add(21);
        //Accumulator means to combine all the elements of the stream into a single result
        // int sum=nums.stream().reduce(0, (a,b)->a+b); 
        nums.stream().sorted((a,b)->b-a).forEach(n->System.out.print(n+" "));
      
    }
}
