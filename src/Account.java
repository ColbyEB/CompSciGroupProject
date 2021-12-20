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
    ArrayList inboxMessages = new ArrayList<Message>();

    public String getName() 
    {
        return name;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
    public void login(ArrayList<Account> accountList)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Username:");
        String loginUsername = s.next();
        System.out.println("Pasword:");
        String loginPassword = s.next();
        boolean loggedIn = false;
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getName().equals(loginUsername) && accountList.get(i).getPassword().equals(loginPassword)) {
                name = loginUsername;
                password = loginPassword;
                System.out.println("Successfully logged in as " + loginUsername);
                loggedIn = true;
                break;
            }
        }
        if (loggedIn == false)
        {
            System.out.println("Incorrect credentials, please login with a valid username and password.");
            login(accountList);
        }
        s.close();
    }
    public String toString()
    {
        return name + " " + password;
    }
    public void sendMessage(Message message)
    {
        message.sender.name = name;
        message.recipient.inboxMessages.add(0, message);
    }
}
