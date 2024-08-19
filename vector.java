import java.util.Vector;
class vector
{
public static void main(String[] args)
        {
        int n = 6;
        Vector<Integer>v=new Vector<>();
        for (int i = 1; i <= n; i++)
        v.add(i);
        System.out.println(v);
        v.remove(3);
        System.out.println(v);
        for (int i = 0; i < v.size(); i++)
        System.out.print(v.get(i) + " ");
        }
        }

