public class User 
{
    private String username;
    private String userEmail;

    public User(String username, String userEmail)
    {
        this.username = username;
        this.userEmail = userEmail;
    }

    public String getUsername()
    {
        return username;
    }
    @Override 
    public String toString()
    {
        return username;
    }
    public String getEmail()
    {
        return userEmail;
    }

    public void display()
    {
        System.out.println("Username: " + username);
        System.out.println("Email: " + userEmail);
    }
    
}
