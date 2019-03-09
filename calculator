// basic calculator that adds, subtracts, multiplies, divides, and gives remainders

//declare class called "Calculator"
class Calculator {
  
  //class constructor
  Calculator() {
    
  }
  
  //declare various methods to allow for different calculator operations
  public int add(int a, int b)  {
    return a + b;
  }
  public int subtract(int a, int b) {
    return a - b;
  }
  
  public int multiply(int a, int b) {
    return a * b;
  }  
    
  public int divide(int a, int b) {
    if (b == 0) { //if statement necessary as division by zero is not feasible
      System.out.println("ERROR! Dividing by zero is not allowed.");
      return 0;
    }
    else {
    return a / b;
    }
  } 
    
  public int modulo(int a, int b) {
    if (b == 0) {
      System.out.println("ERROR! Dividing by zero is not allowed.");
      return 0;
    }
    else {
      return a % b;
    }
  } 
    
 
  
  public static void main(String args[]) {
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));
  }
  
}
