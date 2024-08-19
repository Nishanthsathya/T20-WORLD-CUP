public class has
{
    private int instanceVariable;
    private String intstancestring;

    public has(int value, String text) {
        int LocalValue=value;
        String LocalString=text;
        this.instanceVariable=LocalValue;
        this.intstancestring=LocalString;
    }

    public int getInstanceVariable() {
        return instanceVariable;
    }

    public String getIntstancestring() {
        return intstancestring;
    }

    public static void main(String[] args) {
        int a=17;
        String str="vanakkam da mapla";
        has x=new has(a,str);
        System.out.println("1st num:" +x.getInstanceVariable());
        System.out.println("1st word:"+x.getIntstancestring());
        printLocalVariables(a, str);
    }
    public static void printLocalVariables(int a,String str)
    {
        System.out.println("2nd num:"+a);
        System.out.println("2nd word:"+str);
    }
}
