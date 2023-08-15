import java.util.ArrayList;

public class Utilies {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        System.out.println("The list is: " + intList);
        int a = 260;
        byte c = (byte) a;
        System.out.println(c);
        byte b = 25;
        b++;
        // b = b+1;
        System.out.println(b);
    }
}
