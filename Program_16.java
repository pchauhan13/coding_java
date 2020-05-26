import java.util.Scanner;

public class Program_16 {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());

        System.out.println("Cats or Dogs?");
        String animal = scan.nextLine();

        if (age > 12 && animal.equals("Dogs"))
        {
            System.out.println("Welcome");
        }
        else
        {
            System.out.println(age + " " + animal);
        }

        scan.close();
    }
}