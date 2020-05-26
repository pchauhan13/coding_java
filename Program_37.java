import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program_37 {
    public static void main(String[] args) {
        List<Integer> allGrades = Arrays.asList(43, 23, 4, 54);

        for (int grade : allGrades)
        {
            System.out.println(grade);
        }

        Collections.sort(allGrades);

        System.out.println("After sorting...");
        for (int grade : allGrades)
        {
            System.out.println(grade);
        }

        Collections.reverse(allGrades);

        System.out.println("After reversing...");
        for (int grade : allGrades)
        {
            System.out.println(grade);
        }
    }
}