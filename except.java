public class except
{
    public static void main(String[] args)
    {
        //throw new exception_class("error message");
        try {
            int a=10/0;
        } catch (Exception e)
        {
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
