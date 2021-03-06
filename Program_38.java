import java.util.ArrayList;
import java.util.List;

class NewUser implements Talk {
    private String firstName;
    private String lastName;
    private boolean isVerified = false;

    public NewUser()
    {
        System.out.println("Creating a User...");
    }

    public NewUser(String fn, String ln)
    {
        firstName = fn;
        lastName = ln;
    }

    public final void sayHello2()
    {
        System.out.println("This is final. You cannot change this in derived class");
    }

    public boolean isVerified()
    {
        return isVerified;
    }

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

    public static int searchList (List<NewUser> users, String fn, String ln)
    {
        return searchList(users, fn + " " + ln);
    }

    public static int searchList (List<NewUser> users, String fullName)
    {
        for (int i = 0; i < users.size(); i++)
        {
            if (users.get(i).message() == fullName)
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString()
    {
        return "User [message() = " + message() + "]";
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        NewUser other = (NewUser) obj;
        if (firstName == null)
        {
            if (other.firstName != null)
            {
                return false;
            }
        }
        else if (!firstName.equals(other.firstName))
        {
            return false;
        }

        if (lastName == null)
        {
            if (other.lastName != null)
            {
                return false;
            }
        }
        else if (!lastName.equals(other.lastName))
        {
            return false;
        }
        return true;
    }

    public void sayHello ()
    {
        System.out.println("Hi! I'm a user. My name is " + message());
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
        System.out.println(user.toString());
    }
}