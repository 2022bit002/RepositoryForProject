package Package1;
class PrivateEx
{
    private int a =100;
    private PrivateEx()
    {
        System.out.println("Prvate Constructo cannot called from outside class.");
    }
    private void show()
    {
        System.out.println("The Show Method....!!!");
    }

    public static void main(String[] args) {
        PrivateEx obj = new PrivateEx();
        obj.show();
        System.out.println("value of A : "+obj.a);
    }
}
public class PrivateModifier {
    public static void main(String[] args) {
        // PrivateEx obj = new PrivateModifier();   Cannot Create Instance of Private from Outside the class
        //if thier is no instance then Calling them is Not Possible.
    }
}
