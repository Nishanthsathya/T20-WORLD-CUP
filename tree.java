import java.util.TreeSet;
import java.util.Scanner;
class tree
{
    public static void main(String[] args){
        TreeSet<String> t = new TreeSet<>();
        Scanner s = new Scanner(System.in);
        int n = 5;
        System.out.println("enter the values:");
        for (int i = 0; i < n; i++) {
            t.add(s.nextLine());
            System.out.println(t);
        }
    }
}
