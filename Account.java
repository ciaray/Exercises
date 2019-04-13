/* 
Script defining the "Account" class which defines the methods (functions) relating to actions performed on the account by the user, 
i.e. retrieving required information from the database stored in the "Bank" class
*/


public class Account {

	// Define private variables (i.e. data can't be accessed elsewhere, only used)
    private String userName;
    private int pin;
    private double balance;

    
    // Constructor
    public Account(String userName, int pin, double initialBalance){ // Define the variables called for this method
        this.userName = userName; // "this." refers to the current object of the constructor 
        this.pin = pin;
        this.balance = initialBalance;
    }
    
    // Method to access user name database from the main code
    public String getUserName(){
        return userName;
    }
    
    // Method to access pin number database from the main code
    public int getPin(){
        return pin;
    }
    
    // Method to access user balance database from the main code
    public double getBalance(){
        return balance;
    }
    

    // Method for withdrawing money from account
    public void withdraw(double amount){
    	
        if(balance - amount >= 0) {
            balance -= amount;
        }
        else{
            System.out.println("Insufficient funds.");
        }
    }
    
    
    // Method for depositing money to account
    public void deposit(double amount){
    	
        if(amount > 0) {
            balance += amount;
        }
        else{
            System.out.println("Deposit amount must be positive.");
        }
    }
    
    
    // Method to change pin number
    public void changePin(int pin){
        this.pin = pin;
    }

    
    // Method to display required user balance
    public String toString(){
        return getUserName() + " balance:" + getBalance() + "\n";
    }

}

