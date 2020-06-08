import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program_44 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Program_44.java"));

        List<String> newList = new ArrayList<>();

        while (in.hasNextLine())
        {
            newList.add(in.nextLine());
        }

        for (int i = 0; i < newList.size(); i++)
        {
            System.out.println(newList.get(i));
        }

        in.close();
    }
}