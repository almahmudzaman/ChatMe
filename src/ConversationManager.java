import java.util.ArrayList;

public class ConversationManager {


    private ArrayList<Conversation> conversations;

    public ConversationManager()
    {
        conversations = new ArrayList<>();
    }
    public boolean createConversation(User user1, User user2)
    {
        if(findConversation(user1, user2) != null)
        {
            return false;
        }

        Conversation conversation = new Conversation(user1, user2);
        conversations.add(conversation);
        return true;
    }

    public int getConversationCount()
    {
        return conversations.size();
    }
    
    public Conversation findConversation(User user1, User user2)
    {
        for(Conversation conversation : conversations)
        {
            if(conversation.getUser1().equals(user1) && conversation.getUser2().equals(user2) || conversation.getUser1().equals(user2) && conversation.getUser2().equals(user1))
            {
                return conversation;
            }
        }
        return null;
    }
    public void displayAllConversations()
    {
        if(conversations.isEmpty())
        {
            System.out.println("No Conversations Found.");
            return;
        }
        for(Conversation conversation: conversations)
        {
            conversation.displayParticipants();
        }
    }
}
