import java.util.ArrayList;
import java.util.Scanner;
public class AccountTester
{
    public static void main(String[] args)
    {

        System.out.println("type \"help\" for help");
        InputCommands inputCommands = new InputCommands();
        inputCommands.checkForCommands();
        Account a1 = new Account("a1", "admin");
        Account a2 = new Account("a2", "admin");
        Account loggedIn = new Account(null, null);
        ArrayList credentials = new ArrayList<Account>();
        credentials.add(a1);
        credentials.add(a2);
        String messageText = "Hello World!";
        loggedIn.login(credentials);

        Message message = new Message(loggedIn, null, messageText);
    }
}
