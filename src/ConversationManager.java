import java.util.ArrayList;

public class ConversationManager {
    
    /*
        3. Start a conversation
        4. Select a conversation
        5. Send messages
        6. View conversations
    */

    private ArrayList<Conversation> conversations;

    public ConversationManager()
    {
        conversations = new ArrayList<>();
    }
    public void createConversation(User user1, User user2)
    {
        Conversation conversation = new Conversation(user1, user2);
        conversations.add(conversation);
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
