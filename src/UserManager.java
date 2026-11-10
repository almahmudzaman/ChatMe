import java.util.HashMap;

public class UserManager 
{
    private HashMap<String, User> users;

    public UserManager()
    {
        users = new HashMap<>();
    }
        /*
        1. Register
        2. Find another user
        */

    public boolean registerUser(User user)
    {
        if(users.containsKey(user.getUsername()))
        {
            return false;
        }
        users.put(user.getUsername(), user);
        return true;
    }
    
    public void displayAllUsers()
    {
        System.out.println("\n=== Users ===");
        for(User user : users.values())
        {
            System.out.println(user + " - " + user.getEmail());
        }
    }

    public User findUser(String username)
    {
        return users.get(username);
    }
    
    public boolean userExists(String Username)
    {
        return users.containsKey(Username);
    }

    public int getUserCount()
    {
        return users.size();
    }
}
