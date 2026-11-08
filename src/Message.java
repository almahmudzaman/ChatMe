import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Message
{

    private User sender;
    private String content;
    private User recipient;
    private LocalDateTime timestamp;

    public Message(User sender, String content, User recipient)
    {
        this.sender = sender;
        this.content = content;
        this.recipient = recipient;
        this.timestamp = LocalDateTime.now();
    }

    public User getSender()
    {
        return sender;
    }

    public String getContent()
    {
        return content;
    }

    public void display()
    {
      /*   System.out.println(sender + ": "+ "(" + recipient + ") " + content + "\n" + timestamp);
        */

      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a, dd MMMM yyyy");

      System.out.println(sender.getUsername() + " -> " + recipient.getUsername() + ": " + content);
      System.out.println(timestamp.format(formatter));

    }

}