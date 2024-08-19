import java.util.HashMap;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("ali",21);
        map.put("hari",27);
        map.put("nisha",22);

        System.out.println("View sets: "+map);
        System.out.println("Total sets: "+map.size());
        if (map.containsKey("nisha"))
        {
            Integer a = map.get("nisha");
            System.out.println("value for key"+" \"nisha\" is: " + a);
        }
    }
}
