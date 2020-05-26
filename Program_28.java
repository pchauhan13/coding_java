import java.util.Arrays;

public class Program_28 {
    public static void main(String[] args) {
        int[] grades = new int[10];

        System.out.println(Arrays.toString(grades));

        for (int i = 0; i < 10; i++)
        {
            grades[i] = i;
        }
        System.out.println(Arrays.toString(grades));
    }
}