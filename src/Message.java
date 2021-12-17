public class Message
{
    Account sender;
    Account recipient;
    String content;
    public Message(Account sender, Account recipient, String content)
    {
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public void setSender(Account sender) 
    {
        this.sender = sender;
    }

    public String getContent()
    {
        return content;
    }
    public void getRecipient(Account recipient) 
    {
    	this.recipient;
    }
}
