import java.util.*;
public class factorial {

  /*public static int factorial( int n){
    if (n == 1){
        return 1;
    }
    else if ( n<0) {
        System.out.println("Invalid number");
        return -1;
        
    }
    else{
        return n * factorial(n-1);
    }
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int fact = factorial(n);
    System.out.println("factorial of given number is " + fact);


  }
    
  }      
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int largestNumber = 0; // Initialize to a value less than any input
        int currentNumber;

        System.out.println("Enter integers (enter 0 to stop):");

        do {
            currentNumber = sc.nextInt();

            if (currentNumber != 0 && (currentNumber > largestNumber || largestNumber == 0)) {
                largestNumber = currentNumber;
            }

        } while (currentNumber != 0);

        if (largestNumber != 0) {
            System.out.println("The largest number entered is: " + largestNumber);
        } else {
            System.out.println("No valid numbers entered.");
        }
    }
}

