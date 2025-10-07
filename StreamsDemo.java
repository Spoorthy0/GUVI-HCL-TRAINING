
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(11);
        numbers.add(21);
        numbers.add(3);
        Stream<Integer> stream=numbers.stream().sorted().map(n->n*2).filter(n->n%3==0);
        stream.forEach((n)->System.out.println(n));
    }
}
