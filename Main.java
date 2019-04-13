import java.util.Scanner;
import org.eclipse.swt.widgets.Display; // creates new window
import org.eclipse.swt.widgets.Shell; // configures the inside of the window
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button; // button tools
import org.eclipse.swt.SWT; // button styles
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.layout.*;


public class Main{

    public static void main(String[] args){

    	// Define user input variable
        Scanner user_input = new Scanner(System.in);
        
        // Create new "Bank" object
        Bank bank = new Bank();
        
        
        
/*  ATTEMPT TO HAVE INTERACTIVE WINDOW DISPLAY

		// display set up
		Display display = new Display();
		
		// shell set up
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout(SWT.VERTICAL));
		shell.setText("My Bank");
		shell.setSize(1100, 500);
		shell.open();
		
		// button set up
		Button button = new Button(shell, SWT.PUSH);
		button.setText("Hi!");
		button.setLocation(0, 0);
		button.setSize(100, 20);
		Button button1 = new Button(shell, SWT.PUSH | SWT.WRAP);
		button1.setLocation(0, 20);
		button1.setSize(100, 20);
		button1.setText("rr");
		Text text = new Text (shell, SWT.SINGLE | SWT.BORDER);
		text.setEchoChar ('*');
		text.setLocation(0, 40);
		text.setSize(100, 20);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.getDisplay().dispose();
				System.exit(0);
		
			}
			
		});
		
		
		// event main loop
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) display.sleep();	
		}
		
		display.dispose();
		
	
*/

        
        // Welcome user
        System.out.print("Welcome to our bank! \nHow many accounts do you wish to open? (enter a number):");
        int numAccounts = Integer.parseInt(user_input.nextLine()); // number of accounts the user desires to open

        // Loops for the requested number of accounts to be created
        for(int i=0; i<numAccounts; i++){
        	
            System.out.print("Enter the account holder's name " + (i+1) + ": ");
            String userName = user_input.nextLine(); // define name on the user's account
            System.out.print("Set a pin for the account: " + (i+1) + ": ");
            int pin = Integer.parseInt(user_input.nextLine()); // set the user's pin for the account
            System.out.println("Enter " + userName + "'s balance: "); // ask the user for the opening balance of the account
            bank.addAccount(new Account(userName, pin, Integer.parseInt(user_input.nextLine()))); // adds an "Account" class object to the bank object using the user input info
            System.out.println("Account created."); // message to signal completion of account creation
            
        }
        
        // Ask user what they would like to do next
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to access an account? Enter 'Yes' or 'End':");
        String edit = input.nextLine();
        
        
        	// While loop to keep playing as long as the user wishes to act on their account
        	while (!edit.equalsIgnoreCase("end")) {
            System.out.print("Enter your name to access your account:");
            String user_name = user_input.nextLine();
            int currentAccountNum=-1;
            
            // Loops through all the accounts (from account number 0 to the number of existing accounts)
            for(int i=0; i<numAccounts; i++){
            	
            	// if statement searches for the input user_name within Account userName "database"
                if(bank.getAccounts().get(i).getUserName().equalsIgnoreCase(user_name)){
                    currentAccountNum = i;
                    break; // end for loop one the user's account has been found
                }
                
            }
            
            // if the input user_name does not match any within the database, the value for currentAccountNum remains -1 and an error message is displayed
            if(currentAccountNum == -1){
                System.out.println("Error! Account not found.");
            }
            
            
            // else, the user_name matches an account userName, and they can access their account
            else {
                System.out.print("Enter your pin:"); 
                int pin = Integer.parseInt(user_input.nextLine());
                
                // check if the pin entered matches the pin set for the corresponding account
                if (pin == bank.getAccounts().get(currentAccountNum).getPin()) {
                    System.out.println("\nEnter 1 to Deposit money into your account\nEnter 2 to Withdraw money from your account\nEnter 3 to Reset Pin\nEnter 4 to show Balance");
                    int command = Integer.parseInt(user_input.nextLine());
                    
                    
                    // switch for all the different commands
                    switch(command) {
                    
                    case 1: // deposit money
                    	System.out.print("Enter the amount to be deposited:");
                    	int amountDep = Integer.parseInt(user_input.nextLine());
                    	bank.getAccounts().get(currentAccountNum).deposit(amountDep);
                    	break;
                    
                    case 2: //withdraw money
                    	System.out.print("Enter the amount to be withdrawn:");
                        int amountWit = Integer.parseInt(user_input.nextLine());
                        bank.getAccounts().get(currentAccountNum).withdraw(amountWit);
                        break;
                        
                    case 3: // change account pin
                    	 System.out.print("Enter the new pin:");
                         int newPin = Integer.parseInt(user_input.nextLine());
                         bank.getAccounts().get(currentAccountNum).changePin(newPin);
                         break;
                         
                    case 4: // display account balance
                    	 System.out.println("Balance:"+ bank.getAccounts().get(currentAccountNum).getBalance() + " €");
                    	 break;
                    	 
                   default: // if the input doesn't match a command number
                	   System.out.println("Invalid command.");
                	   break;
                    
                    }
                    }
                   
                
                // the pin doesn't match
                else {
                    System.out.println("Incorrect pin.");
                }
            }
            
            // Ask again what the user would like to do next
            System.out.print("Do you wish to edit another account?\nEnter 'Yes' or 'End':");
            edit = user_input.nextLine();
        }

        // Exit message when the user requests to "end" banking	
        System.out.println("Thank you for your visit!");
        System.exit(0);
        
    }
}
