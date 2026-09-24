
import java.util.Scanner;


record Bankinfo(String name,String branch)
{}
    enum Menuoption
    {
        OPEN_ACCOUNT, 
        DEPOSIT,
        WITHDRAW,
        TRANSFER,
        EXIT
    }

public class Minibank
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        Bankinfo bank =new Bankinfo("Minibank","CHARUSSAT");
        System.out.println("==================");
        System.out.println("    "+bank.name());
        System.out.println("     Branch:"+bank.branch());
        System.out.println("==================");
        boolean running=true;

        while(running)
        {
            System.out.println("\n -----MiniBank  Menu-----");
            System.out.println("1. OPEN_ACCOUNT");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. TRANSFER");
            System.out.println("5. EXIT");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();

            Menuoption option;
            switch(choice)
            {
                case 1:
                    option=Menuoption.OPEN_ACCOUNT;
                    break;
                
                case 2:
                    option=Menuoption.DEPOSIT;
                    break;
                
                case 3:
                    option=Menuoption.WITHDRAW;
                    break;
                
                case 4:
                    option=Menuoption.TRANSFER;
                    break;
                
                case 5:
                    option=Menuoption.EXIT;
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            } 
            switch (option) 
            {
                case OPEN_ACCOUNT->System.out.println("open account - to be imlemented in later lab.");
                case DEPOSIT->System.out.println("deposit - to be imlemented in later lab.");
                case WITHDRAW->System.out.println("withdraw - to be imlemented in later lab.");
                case TRANSFER->System.out.println("transfer - to be imlemented in later lab.");
                case EXIT->
                {
                    System.out.println("Thank you to visi our minibank!");
                    running = false;
                }
        }
        
    }
    scanner.close();
}
}