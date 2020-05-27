class NewUser {
    private String firstName;
    private String lastName;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String value)
    {
        firstName = value;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String value)
    {
        lastName = value;
    }

    public void output(int times)
    {
        for (int i = 0; i < times; i++)
        {
            System.out.println(firstName + " " + lastName);
        }
    }

    public String message()
    {
        return firstName + " " + lastName;
    }
}

public class Program_38 {
    public static void main(String[] args) {
        NewUser user = new NewUser();
        user.setFirstName("Sub");
        user.setLastName("Scriber");
        // System.out.println(user.firstName);
        user.output(5);
        System.out.println(user.message());
    }
}