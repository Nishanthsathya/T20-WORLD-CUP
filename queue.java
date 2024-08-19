import java.util.LinkedList;
import java.util.Queue;
public class queue {
    public static void main(String[] args) {
       Queue<String>q=new LinkedList<>();
        q.add("apple");q.add("banana");q.add("cherry");
        System.out.println("Queue: " + q);
        String f = q.remove();
        System.out.println("Removed element: " + f);
        System.out.println("Queue after removal: " + q);
        q.add("date");
        String p=q.peek();
        System.out.println("Peeked element: " + p);
        System.out.println("Queue after peek: " + q);
    }
}
