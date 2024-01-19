package Package2;
import Package1.*;
public class ProtectedEx extends ProtectedUse {
    public static void main(String[] args) {
        ProtectedEx o1 = new ProtectedEx();
        System.out.println("add : "+o1.add(10, 20));
    }
}
