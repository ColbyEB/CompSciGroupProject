import java.util.Scanner;

public class InputCommands
{
    public InputCommands(){}
    public void checkForCommands()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.indexOf("help") == 0)
        {
            System.out.println("available commands are \"send message\" \"inbox\" \"login\", and \"logout\"");
            sc.close();
            checkForCommands();
        }
        else if(str.indexOf("send message") == 0)
        {

        }
        else if(str.indexOf("inbox") == 0){}
        else if(str.indexOf("login") == 0){}
        else if(str.indexOf("logout") == 0){}
        else
    }
}
