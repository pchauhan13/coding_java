import java.io.IOException;

public class Program_47 {
    public static void main(String[] args) {
        Program_47 program = new Program_47();

        program.doSomething();
    }

    void doSomething()
    {
        try
        {
            throw new IOException();
        }
        catch (IOException e)
        {
            System.out.println("more specific");
        }
        catch (Exception e)
        {
            System.out.println("Caught ya!");
            e.printStackTrace();
        }
    }
}