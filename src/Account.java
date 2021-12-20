import java.util.ArrayList;
import java.util.Scanner;

/**
 * Simulates the class account
 * @author Colby B
 * @author Sabrina G
 * @author Claire J
 */
public class Account
{
    String name;
    String password;
    
    /**
     * Creates an account with its name and the password.
     * @param name String of the account's name
     * @param password String of the account's password
     */
    public Account(String name, String password)
    {
        this.name = name;
        this.password = password;
    }
    ArrayList inboxMessages = new ArrayList<Message>();
 
    /**
     * returns name of the account.
     */
    public String getName() 
    {
        return name;
    }

    /**
     * returns password of the account.
     */
    public String getPassword() 
    {
        return password;
    }

    /**
     * Set the password of the account
     * @param password set the password of the account
     */
    public void setPassword(String password) 
    {
        this.password = password;
    }

    /**
     * Set the name of the account
     * @param name set the name of the account
     */
    public void setName(String name) 
    {
        this.name = name;
    }
    
    /**
     * Login the user when they insert their username and their password. 
     * If their input is false from the set input, recursion happens.  
     * @param accountList Arraylist of the account
     */
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
    
    /**
     * Return the string representation of the object.
     * @return string representation of the object
     */
    public String toString()
    {
        return name + " " + password;
    }
    
    /**
     * Sends message to the other account
     * @param message message for the sender
     */
    public void sendMessage(Message message)
    {
        message.sender.name = name;
        message.recipient.inboxMessages.add(0, message);
    }
}