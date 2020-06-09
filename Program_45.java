import java.util.Iterator;
import java.util.LinkedList;

public class Program_45 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Prashant");
        list.add("Jason");
        list.add("Linus");

        Iterator<String> iter = list.iterator();

        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}