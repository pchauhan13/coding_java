import java.util.Arrays;
import java.util.List;

public class Program_36 {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(1, 2, 3, 4, 5);
        int[] gradesArr = new int[grades.size()];

        for (int i = 0; i < grades.size(); i++)
        {
            gradesArr[i] = grades.get(i);
        }

        System.out.println(Arrays.toString(gradesArr));
    }
}