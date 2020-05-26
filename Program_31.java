import java.util.Arrays;

public class Program_31 {
    public static void main(final String[] args) {
        int[] grades = { 1, 2, 3, 4, 5 };

        Arrays.fill(grades, 72);

        System.out.println(Arrays.toString(grades));
    }
}