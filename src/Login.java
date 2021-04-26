import java.util.Scanner;

public class Login {
    private String name;
    private String password;

    public Login(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public boolean userLogin(String uname, String upassword){
        System.out.println("Please enter your name : ");
        Scanner scanner = new Scanner(System.in);
        uname=scanner.nextLine();
        System.out.println("Please enter your password : ");
        upassword=scanner.nextLine();
        return uname.equals(name) && upassword.equals(password) ? true : false;
    }
}
