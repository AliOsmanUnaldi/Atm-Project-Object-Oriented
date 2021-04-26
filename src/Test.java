import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Account account1=new Account("Ali","123456789","159753",1000.0,"05051234567","ali@yahoo.com");
        Login login=new Login(account1.getName(),account1.getPassword());
        int right=3;
        while (right>0){
            if (login.userLogin(account1.getName(),account1.getPassword())){
                System.out.println("You entered the system successfully.");
                right=0;
            }
            else {
                right--;
                System.out.println("Unvalid name or password! Try again with correct informations! You can try only "+right+" times more!!");
                if (right==0){
                    System.out.println("You can not try anymore...");
                    System.exit(0);
                }
            }

        }

        System.out.println("---MENU--");
        System.out.println("1.Show informations");
        System.out.println("2.Deposit");
        System.out.println("3.Withdrawal");
        System.out.println("4.Quit");
        System.out.println("Please choose an operation : ");
        Scanner scanner=new Scanner(System.in);
        int operation=scanner.nextInt();
        switch (operation){
            case 1: account1.showInfos();
                break;
            case 2:
                System.out.println("Enter the amount that you would like to deposit : ");
                double amount=scanner.nextDouble();
                account1.cashDeposit(amount);
                break;
            case 3:
                System.out.println("Enter the amount that you would like to withdrawal : ");
                double amount1=scanner.nextDouble();
                account1.withdrawal(amount1);
                break;
            case 4:
                System.out.println("You are quiting...");
                break;
        }
    }
}
