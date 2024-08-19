import java.util.LinkedList;

public class linked {
    public static void main(String[] args)
    {

        LinkedList<String>ll=new LinkedList<>();

        ll.add("abc");
        ll.add("nia");

        ll.add(1,"def");
        System.out.println("after add: "+ll);

        ll.set(0,"why");
        System.out.println("After change: "+ll);

        ll.remove(1);
        System.out.println("After remove: "+ll);
    }
}
