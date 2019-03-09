// Math magic code that returns the value 3 regardless of the original integer input     
      
class project {
	public static void main(String[] args) {

 
    // set original integer value  
    int myNumber = 9;
    
    // steps to returning 3  
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;

    // print the output value (3)  
    System.out.println(stepSix);
      
    }
}
