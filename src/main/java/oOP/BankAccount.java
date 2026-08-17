package oOP;

public class BankAccount {
    private String owner;
    private double balance;
    public  BankAccount (String owner, double balance){
        this.balance = balance;
        this.owner = owner;
    }

    String getOwner(){
        return this.owner;
    }
    double getBalance(){
        return this.balance;
    }

    void setOwner(String owner){
        this.owner = owner;
    }

    void deposit (double amount){
        this.balance += amount;
    }

    void withdraw( double amount){
        this.balance -= amount;
    }

    void printBalance(){
        System.out.println("My balance is : " + this.balance);
    }


    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Alex", 8000);
        a1.deposit(500);
        a1.printBalance();

        a1.withdraw(500);
        a1.printBalance();
    }

}
