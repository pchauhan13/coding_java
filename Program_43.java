import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program_43 {
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("./Program_43.java");
        Scanner in = new Scanner(file);

        while (in.hasNextLine())
        {
            System.out.println(in.nextLine());
        }

        in.close();
    }
}