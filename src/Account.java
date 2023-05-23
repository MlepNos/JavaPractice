public class Account {
    private int accountnumber;
    private double balance;
    private String name;
    private String email;
    private String phonenumber;
    //Getters
    public int getAccountnumber() {
        return accountnumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
     //Setters
    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void DepositInto(double number){
        this.balance += number;
        System.out.println("Your Current Balance is: "+ this.balance);
    }

    public void Withdraw(double number){
        if(this.balance - number < 0){
            System.out.println("You are not allowed to do this");
        }else{
            this.balance -= number;
            System.out.println("Your Current Balance is: "+ this.balance);
        }
    }
}
