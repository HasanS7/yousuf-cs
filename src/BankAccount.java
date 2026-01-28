import java.util.*;
public class BankAccount {
    private double balance;
    private int pin;

    public BankAccount(double balance, int pin){
        this.balance = balance;
        this.pin = pin;
    }
    public double getBalance(){
        return this.balance;
    }
    public void printBalance(){
        System.out.println("Balance: " + balance);
    }
    public void deposit(double amount){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 4-digit Pin:");
        int L = s.nextInt();
        if(L == pin){
            System.out.println("Login Successful!");
            balance = balance + amount;
            System.out.println(amount + " " + "deposited");
        }
        else System.out.println("Incorrect Pin!");
    }
    public void withdraw(double amount) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 4-digit Pin:");
        int L = s.nextInt();
        if (amount <= balance && L == pin) {
            balance = balance - amount;
            System.out.println("Money withdrawn");
        } else if (amount > balance) {
            System.out.println("Not Enough Funds in account!");
        }
    }
    public void transfer(BankAccount other, double amount){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 4-digit Pin:");
        int L = s.nextInt();
        if(amount <= balance && L == pin){
            balance = balance - amount;
            System.out.println("Money Transferred");
            other.balance = other.balance + amount;
        }
        else if(amount >= balance && L == pin){
            System.out.println("Not Enough Funds in account!");
        }
        else System.out.println("Incorrect Pin!");

    }
}
