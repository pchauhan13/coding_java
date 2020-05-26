import java.util.Scanner;

public class Program_18 {
    public static void main(String[] args) {
        System.out.println("What's your name?");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        switch (input)
        {
            case "Prashant":
                System.out.println("Welcome my man!");
                break;
            case "Caleb":
                System.out.println("Get away");
                break;
            default:
                System.out.println("I don't know what to do");
        }

        scan.close();
    }
}