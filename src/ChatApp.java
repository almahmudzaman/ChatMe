/*import java.util.ArrayList;

public class ChatApp
{
    public static void main(String[] args)
    {
        ArrayList<Message> messages = new ArrayList<>();

        messages.add(new Message("Mahi","Ki koro?"));
        messages.add(new Message("Joti","Portechi, tumi ki koro?"));
        messages.add(new Message("Mahi","kisu na, rater khabar khabo. Klk asbe?"));
        messages.add(new Message("Joti","Pore jabo. Tumi to jaba, tai na?"));
        messages.add(new Message("Mahi","Ha, ami jabo. Sir jaheto jete bolse."));
        messages.add(new Message("Joti","A kota to vulai gashilam."));
    
        for (Message message : messages)
        {
            message.display();
        }

        int MC = messages.size();
        System.out.println("Total Messages: " + MC);

        for ( Message message : messages)
        {
            if(message.getSender().equals("Mahi"))
            {
                message.display();
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class ChatApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Message> messages = new ArrayList<>();

        System.out.println("===================================");
        System.out.println("Wrelcome to ChatMe");
        System.out.println("===================================");

        System.out.print("Enter your Username: ");
        String userName = scanner.nextLine();
        if(userName.trim().isEmpty() || userName.length() < 3 || !userName.matches("[a-z0-9_]+") || !Character.isLetter(userName.charAt(0)))
        {
            System.out.println("⚠️Invalid Username. Please enter a valid username (at least 3 characters, only lowercase letters, numbers, and underscores, starting with a letter).");
        }
        else
        {
            System.out.println("\nWelcome," + userName + "!");
            boolean running = true;
        
            while(running)
            {
                System.out.println("\n1. Send Message");
                System.out.println("2. View Chat History");
                System.out.println("3. Clear Chat History");
                System.out.println("4. Message Count");
                System.out.println("5. Exit");

                System.out.print("\nChoose an option: ");
                String choice = scanner.nextLine();

                switch(choice)
                {
                    case "1":
                        System.out.print("Enter Recipient's Username: ");
                        String recipientUsername = scanner.nextLine();
                        if(recipientUsername.trim().isEmpty())
                        {
                            System.out.println("Recipient's Username cannot be empty. Please try again.🔄️");
                            break;
                        }
                        System.out.println
                        ("===================================");

                        System.out.print("Enter your message: ");
                        String content = scanner.nextLine();

                        if(content.trim().isEmpty())
                        {
                            System.out.println("Message cannot be empty. Please try again.(❁´◡`❁)");
                        }
                        else
                        {
                            Message message = new Message(userName, content, recipientUsername);
                            messages.add(message);
                            System.out.println("Message sent successfully!(´❁◡❁`)");
                        }
                        break;
                    case "2":
                        System.out.println("\n ========== Chat ヾ(＠⌒ー⌒＠)ノ History ==========");
                        if(messages.isEmpty())
                        {
                            System.out.println("No messages yet. ＞﹏＜");
                        }
                        else
                        {
                            for(Message message : messages)
                            {
                                message.display();
                            }
                        }
                        break;
                    case "3":
                        messages.clear();
                        System.out.println("Chat history cleared successfully! (｡•́︿•̀｡)");
                        break;
                    case "4":
                        int mesCount = messages.size();
                        if(mesCount ==0)
                        {
                            System.out.println("No messages sent yet.");
                        }
                        else if (mesCount == 1)
                        {
                            System.out.println(mesCount +" message sent.");
                        }
                        else
                        {
                            System.out.println(mesCount +" messages sent.");
                        }
                        break;
                    case "5":
                        running = false;
                        System.out.println("Thank you for using ChatMe! Goodbye! (｡•́︿•̀｡)");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again. (╯︵╰,)");
                        break;
                }
            }
        }
        scanner.close();
    }
}
    */

public class ChatApp {

    public static void main(String[] args) {

        User alex = new User("alex", "alex@gamil.com");
        User sam = new User("sam","sam@gamil.com");
        User zams = new User("Zams","zams@yahoo.com");

        Conversation conversation1 =
                new Conversation(alex, sam);
        Conversation conversation2 =
                new Conversation(zams, sam);

        conversation1.sendMessage(
                alex,
                "Hello Sam!"
        );

        conversation1.sendMessage(
                sam,
                "Hi Alex!"
        );

        conversation1.sendMessage(
                alex,
                "How are you?"
        );

        conversation2.sendMessage(zams, "Kmn aso?");
        conversation2.sendMessage(sam, "Valo.");

        conversation1.displayParticipants();
        sam.display();
        alex.display();
        conversation1.displayConversation();
        System.out.println(
            "Messages: " + conversation1.getMessageCount()
        );

        System.out.println(
            "=================== =============================" );
        conversation2.displayParticipants();
        conversation2.displayConversation();
        System.out.println(
            "Messages: " + conversation2.getMessageCount()
        );
    }
}