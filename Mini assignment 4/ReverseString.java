import java.util.ArrayList;
import java.util.Collections;

public class ReverseString {
    public static void main(String[] args) {

        ArrayList<String> lst = new ArrayList<String>();

        lst.add("hashedin");
        lst.add("by");
        lst.add("Deloitte");
        lst.add("2022");

        System.out.println("List: "+lst);

        Collections.reverse(lst);

        System.out.println("Reverse List: "+lst);
    }
}