import java.util.ArrayList;

public class Conversation 
{
    private User u1;
    private User u2;

    private ArrayList<Message> messages;

    public Conversation(User user1, User user2)
    {
        this.u1 = user1;
        this.u2 = user2;

        messages = new ArrayList<>();
    }

    public User getUser1()
    {
        return u1;
    }

    public User getUser2()
    {
        return u2;
    }
    
    public void sendMessage(User sender, String content)
    {
        if(content == null || content.trim().isEmpty())
        {
            System.out.println("Message cannot be empty.");
            return;
        }
        User recipient;

        if(sender == u1)
        {
            recipient = u2;
        }
        else
        {
            recipient = u1;
        }

        Message message = new Message(sender, content, recipient);

        messages.add(message);
    }
    
    public int getMessageCount()
    {
        return messages.size();
    }
    public void displayConversation()
    {
        if(messages.isEmpty())
        {
            System.out.println("No message yet.");
            return;
        }

        System.out.println("\n======= Conversation ========");

        for(Message message: messages)
        {
            message.display();
        }
    }

    public void displayParticipants()
    {
        System.out.println("\nConversation between: \n" + u1 + "\n" + u2 + "\n");
    }
}
