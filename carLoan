// code to calculate car loan repayment in a simplified scenario

class carloan {
 	public static void main(String[] args) {

  // set initial values  
    int carLoan = 10000;
    int loanLength = 3; //length in years
    int interestRate = 5; //in percent
    int downPayment = 2000; //provided by user for car
    
  // if statement to prevent invalid loan conditions
    if (loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! This car loan is invalid, please enter valid conditions.");
    }
    
    else if (downPayment >= carLoan) {
      System.out.println("No need for a loan, the car can be paid in full.");
    }
    
    else {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months; //monthly payment without interest
      int interest = (monthlyBalance * interestRate) / 100;
      int monthlyPayment = monthlyBalance + interest;
      
      System.out.println(monthlyPayment);
    }
      
      
  }
}
