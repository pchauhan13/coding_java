class User {
    public String firstName;
    public String lastName;

    public String getFullName ()
    {
        return this.firstName + " " + this.lastName;
    }

}

public class Program_14 {
    public static void main(String[] args) {
        User user = new User();
        user.firstName = "Prashant";
        user.lastName = "Singh Chauhan";
        System.out.println(user.getFullName());
    }
}