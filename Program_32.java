import java.util.Arrays;
import java.util.List;

public class Program_32 {
    public static void main(String[] args) {
        String[] arr = new String[5];
        Arrays.fill(arr, "");

        System.out.println(Arrays.toString(arr));

        List<String> arr_list = Arrays.asList(arr);
        System.out.println(arr_list.toString());
    }
}