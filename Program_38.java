import java.util.ArrayList;
import java.util.List;

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

    public void output (boolean nice)
    {
        if (nice)
        {
            System.out.println("You are a beautiful person - " + firstName + " " + lastName);
        }
        else
        {
            System.out.println("You are a freak - " + firstName + " " + lastName);
        }
    }

    public String message()
    {
        return firstName + " " + lastName;
    }

    public static void printUser(NewUser user)
    {
        System.out.println(user.message());
    }

    public static void printUsers(List<NewUser> users)
    {
        for (NewUser user : users)
        {
            System.out.println(user.message());
        }
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

        NewUser anotherUser = new NewUser();
        anotherUser.setFirstName("Prashant");
        anotherUser.setLastName("Singh");

        List<NewUser> users = new ArrayList<NewUser>();
        users.add(user);
        users.add(anotherUser);

        for (NewUser user2 : users)
        {
            System.out.println(user2.message());
        }

        NewUser.printUser(user);
        NewUser.printUser(anotherUser);

        NewUser.printUsers(users);

        user.output(true);
    }
}