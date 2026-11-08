
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