import java.util.Arrays;

public class Program_30 {
    public static void main(String[] args) {
        int[] grades = { 1, 2, 3, 4, 5 };
        int[] anotherGrades = { 1, 2, 3, 4, 5 };

        if (grades == anotherGrades)
        {
            System.out.println("equals using ==");
        }

        if (grades.equals(anotherGrades))
        {
            System.out.println("equals using equals method");
        }

        System.out.println(grades + " " + anotherGrades);

        if (Arrays.equals(grades, anotherGrades))
        {
            System.out.println("equals using arrays method");
        }
    }
}