abstract class AbstractUser implements Talk
{
    public String name;

    public abstract void sayHello();

    public final void sayHello2()
    {
        System.out.println("This is final. You cannot change this in derived class");
    }
}

class AbstractStudent extends AbstractUser
{
    public String major;

    @Override
    public void sayHello()
    {
        // super.sayHello();
        System.out.println("My major is " + major);
    }
}

public class Program_40 {
    public static void main(String[] args) {
        AbstractStudent as = new AbstractStudent();
        as.major = "Mustache design";
        as.sayHello();
    }
}