abstract class AbstractUser
{
    public String name;

    public void sayHello()
    {
        System.out.println("Hi, I'm a user. My name is " + name);
    }
}

class AbstractStudent extends AbstractUser
{
    public String major;

    @Override
    public void sayHello()
    {
        super.sayHello();
        System.out.println("My major is " + major);
    }
}

public class Program_40 {
    public static void main(String[] args) {
        
    }
}