public class Account {

    private String userName;
    private String password;
    private double balance;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositValue) {
        balance += depositValue;
        System.out.println("Your Current Balance: " + balance);
    }

    public void withdrawMoney(double withdrawMoneyValue) {
        if (withdrawMoneyValue > balance) {
            System.out.println("You have less money in your account than you want to withdraw.\nYour Current Balance: " + balance);
        } else if (withdrawMoneyValue > 5000) {
            System.out.println("No more than 5000 TL can be withdrawn from our ATMs in one day.");
        } else {
            balance -= withdrawMoneyValue;
            System.out.println("Your Current Balance: " + balance);
        }
    }

    Account(String userName, String password, double balance) {
        this.userName = userName;
        this.password = password;
        this.balance = balance;
    }

}
