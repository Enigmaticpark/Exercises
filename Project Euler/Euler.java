import java.util.*;

class Euler{
  public static void main (String[] args){
    System.out.println(problemOne(0 , 1000));
    System.out.println(problemTwo(4000000));
  }
  
  private static int problemOne(int low, int high){
    /* If we list all the natural numbers below 10 that are multiples of 3 or 5,
     * we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all 
     * the multiples of 3 or 5 below 1000. */
    
    // Declare list and sum
    ArrayList<Integer> list = new ArrayList<Integer>();
    int sum = 0;
      
    // Iterate through each number in the range given
    for(int i = low; i <= high; i++){
      // Identify multiples of 3 or 5
      if(i % 3 == 0 || i % 5 == 0){
        // Add to ArrayList if multiples of 3 or 5
        list.add(i);
      }
    }
    
    // Iterate through the entire ArrayList
    for(int num : list){
      // Sum the numbers 
      sum += num;
    }
    
    // Result answer
    return sum;
  }
  
  private static int problemTwo (int upto){
    /* By considering the terms in the Fibonacci sequence whose values 
     * do not exceed four million, find the sum of the even-valued terms.*/
    
    // Declare variable for result
    int result = 0;
    
    // Iterates through each number in the sequence until the input value
    for(int i = 1; i <= upto; i++){
      // Check to see if term is even
      if (problemTwoHelper(i) % 2 == 0){
        // Add even-valued term to result;
        result += problemTwoHelper(i);
      }
    }
    
    // Return sum of even-valued Fibonacci numbers
    return result;
  }
  
  // Recursive helper method to return Fibonacci sequence
  private static int problemTwoHelper (int num){
    if (num == 1 || num == 2){
      return 1;
    }
    return problemTwoHelper(num - 1) + problemTwoHelper(num - 2);
  }
}