import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Message
{

    private String sender;
    private String content;
    private String recipient;
    private String timestamp;

    public Message(String sender, String content, String recipient)
    {
        this.sender = sender;
        this.content = content;
        this.recipient = recipient;

        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm a; dd MMMM yyyy");
        this.timestamp = LocalDateTime.now().format(f);
    }

    public String getSender()
    {
        return sender;
    }

    public String getContent()
    {
        return content;
    }

    public void display()
    {
        System.out.println(sender + ": "+ "(" + recipient + ") " + content + "\n" + timestamp);
        
    }

}