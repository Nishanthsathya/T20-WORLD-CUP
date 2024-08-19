import java.util.LinkedHashSet;
public class linkedH
{

    public static void main(String[] args)
    {
        LinkedHashSet<String>ls = new LinkedHashSet<>();
        ls.add("A");ls.add("B");ls.add("C");
        ls.add("D");ls.add("E");ls.add("F");
        System.out.println("Size of LinkedHashSet = " +ls.size());
        System.out.println("Original LinkedHashSet:" +ls);
        System.out.println("Removing D from LinkedHashSet: " +ls.remove("D"));
        System.out.println("Trying to Remove Z which is not " + "present: " +ls.remove("Z"));
        System.out.println("Checking if A is present=" +ls.contains("A"));
        System.out.println("Updated LinkedHashSet: " +ls);
    }
}
