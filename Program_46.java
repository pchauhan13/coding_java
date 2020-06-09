import java.util.HashMap;

public class Program_46 {
    public static void main(String[] args) {
        System.out.println("hello, world!".hashCode());

        HashMap<String, Integer> ids = new HashMap<>();

        ids.put("Prashant", 4);
        ids.put("Caleb", 4);

        System.out.println(ids.get("Prashant"));
    }
}