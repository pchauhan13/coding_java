import java.util.ArrayList;
import java.util.List;

public class Program_34 {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<Integer>();

        System.out.println(grades.isEmpty());

        grades.add(1);
        grades.add(2);
        grades.set(1, 5);

        System.out.println(grades.get(0));
        System.out.println(grades.get(1));
        // System.out.println(grades.get(2));

        System.out.println(grades.contains(5));
        System.out.println(grades.contains(7));

        System.out.println(grades.isEmpty());
    }
}