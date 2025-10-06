package com.Rahul.day52;

class BankAccount{
    private int balance;
    BankAccount(int bal){
        balance = bal;
    }

    public void deposit(int n){
        balance += n;
    }
    public void withdraw(int n){
        if(balance < n){
            System.out.println("Cannot perform operation");
        }
        else{
            balance -= n;
        }
    }
    public void checkBalance(){
        System.out.println("Balance: " + balance);
    }

}

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(5000);
        ba.checkBalance();
        ba.deposit(3000);
        ba.withdraw(2000);
        ba.checkBalance();
    }
}
