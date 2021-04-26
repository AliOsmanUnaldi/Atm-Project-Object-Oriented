public class Account {
    private String name;
    private String password;
    private String accountNo;
    private double balance;
    private String phone;
    private String email;

    public void showInfos(){
        System.out.println("Name : "+name);
        System.out.println("Account No : "+accountNo);
        System.out.println("Balance : "+balance);
        System.out.println("Phone : "+phone);
        System.out.println("Email : "+email);
    }

    public void cashDeposit(double amount){
        balance+=amount;
        System.out.println("New balance : "+balance);
    }

    public void withdrawal(double amount){
        if (amount>balance){
            System.out.println("Insufficient balance! Your balance is : "+balance);
        }
        else {
        balance-=amount;
        System.out.println("New balance : "+balance);
        }
    }

    public Account(String name,String password,String accountNo,double balance,String phone,String email) {
        this.name=name;
        this.password=password;
        this.accountNo=accountNo;
        this.balance=balance;
        this.phone=phone;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
