
public class ChatApp
{
    public static void main(String[] args)
    {
        UserManager userManager = new UserManager();
        User alex = new User("Alex", "alex@gmail.com");
        User alex2 = new User("alex", "alex@gmail.com");
        User roy = new User("roy", "alex@gmail.com");
        User sam = new User("sam", "alex@gmail.com");
        
        userManager.registerUser(alex);
        userManager.registerUser(roy);
        userManager.registerUser(sam);

        System.out.println(userManager.registerUser(alex2));

        userManager.displayAllUsers();
        System.out.println("\nTotal users: " + userManager.getUserCount());

        User foundUser = userManager.findUser("alexa");
        if(foundUser != null)
        {
            System.out.println("\nUser found: " + foundUser.getUsername());
        }
        else
        {
            System.out.println("User not founded.");
        }
        ConversationManager cm = new ConversationManager();

        cm.createConversation(alex, roy);
        cm.createConversation(alex, sam);

        if (cm.createConversation(alex, sam)) 
        {
            System.out.println("Conversation created.");
        } 
        else 
        {
            System.out.println("Conversation already exists.");
        }
        System.out.println("\nTotal Conversations: " + cm.getConversationCount());
        System.out.println("\n=== Conversations ===");
        cm.displayAllConversations();
        if(cm.findConversation(roy, sam) == null)
        {
            System.out.print("Conversation not founded..");
        }
        else
        {
            System.out.print("Conversation founded..");   
        }
    }
}