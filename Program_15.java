import java.util.Scanner;

public class Program_15 {
    public static void main(String[] args) {
        String password = "let me in";
        System.out.println("Guess the password:");

        Scanner scan = new Scanner(System.in);
        String guess = scan.nextLine();
        scan.close();

        System.out.println(password.equals(guess));

        if (password.equals(guess))
        {
            System.out.println("Your guess was correct!");
        }
        else if ("don't stop believing".equals(guess))
        {
            System.out.println("You got the second password.");
        }
        else
        {
            System.out.println("This is false");
        }
    }
}