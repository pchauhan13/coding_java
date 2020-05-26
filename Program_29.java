import java.util.Arrays;

public class Program_29 {
    public static void main(String[] args) {
        int[] grades = { 4, 2, 3, 4, 5, 6, 2, 1 };
        System.out.println("Before sorting: " + Arrays.toString(grades));
        Arrays.sort(grades);
        System.out.println("After sorting: " + Arrays.toString(grades));

        int[] largeGrades = new int[1000];
        for (int i = 0; i < 1000; i++)
        {
            largeGrades[i] = 1000 - i;
        }
        System.out.println("Large array, before sorting: " + Arrays.toString(largeGrades));
        Arrays.parallelSort(largeGrades);
        System.out.println("Large array, after sorting: " + Arrays.toString(largeGrades));
    }
}