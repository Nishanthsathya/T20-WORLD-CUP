import java.util.ArrayList;
public class array_list {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("M"); list.add("A");
        list.add("K"); list.add("E");

        System.out.println("Array list:"+list);
        list.add(0,"C");
        System.out.println("After add 'C':"+list);
        list.remove(2);
        System.out.println("After remove index '2':"+list);
        list.remove("K");
        System.out.println("After remove obj'K':"+list);
        String element= list.get(0);
        System.out.println("what's on '0':"+element);
        list.set(2,"W");
        System.out.println("After 'W':"+list);
        int size= list.size();
        System.out.println("no.of elements:"+size);
    }
}