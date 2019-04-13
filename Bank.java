/*
Bank class which stores user input information concerning accounts
*/


import java.util.LinkedList;

public class Bank {

    private LinkedList<Account> accounts; // LinkedList = array that you don't need to specify a size for

    // Constructor
    public Bank(){
        this.accounts = new LinkedList<>();
    }

    // Method to store and allow access to accounts from the main script
    public LinkedList<Account> getAccounts(){
        return accounts;
    }

    // Adds an object of "Account" class to the specified bank object
    public void addAccount(Account account){
        accounts.add(account);
    }
}
