
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;





public class QueueCollection {
    public static void main(String[] args) {
        // Queue<String> queue=new LinkedList<>();
        // queue.add("Spoorthy");
        // queue.offer("Bob");
        // queue.add("Alice");

        // System.out.println("Queue: "+queue);

        // String topElement=queue.peek();
        // System.out.println("Top element: "+topElement);

        // String removedElement=queue.poll();
        // System.out.println("Removed element:"+removedElement);


        // PriorityQueue<Integer> pQueue=new PriorityQueue<>();
        // pQueue.add(10);
        // pQueue.add(3);
        // pQueue.add(7);
        // pQueue.offer(5);
        // pQueue.add(9);

        // System.out.println("Priority Queue: "+pQueue);

        // pQueue.poll();
        // System.out.println(pQueue);



        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(32);
        dq.addLast(56);
        dq.add(6);
        dq.add(87);
        dq.addLast(9);
        System.out.println(dq);

        Deque<Integer> dq1=dq.reversed();

        //System.out.println(dq1);

       Iterator<Integer> it=dq.iterator();
       while(it.hasNext()){
        System.out.print(it.next()+" ");
       }


    

    }
    
}
