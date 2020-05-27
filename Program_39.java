class Student extends NewUser
{
    private boolean isVerified = true;
    private String major;

    public void setMajor(String value)
    {
        major = value;
    }

    public String getMajor()
    {
        return major;
    }

    public boolean isVerified()
    {
        return isVerified;
    }

    @Override
    public void sayHello()
    {
        super.sayHello();
        System.out.println("My major is " + major);
    }
}

public class Program_39 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setMajor("Mustache Design");
        System.out.println(s.getMajor());

        s.setFirstName("smartie");
        s.setLastName("Not a candy");
        s.sayHello();
    }
}