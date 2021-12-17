import java.util.ArrayList;
import java.util.Scanner;
public class Account
{
    String name;
    String password;
    public Account(String name, String password)
    {
        this.name = name;
        this.password = password;
    }
    Scanner s = new Scanner(System.in);
    ArrayList inboxMessages = new ArrayList<Message>();

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void login(ArrayList<Account> accountList)
    {
        String username = s.next();
        String password = s.next();
        int index =  accountList.indexOf(username);
        if (accountList.contains(username) && accountList.indexOf(password) == index)
        {
            name = username;
            this.password = password;
        }
        else
        System.out.println("Please log in with valid credentials");
    }

    public void sendMessage(Message message)
    {
        message.sender.name = name;
        message.recipient.inboxMessages.add(0, message);
    }
}
