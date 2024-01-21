import java.util.*;
public class factorial {

  public static int factorial( int n){
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
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int fact = factorial(n);
    System.out.println("factorial of given number is " + fact);


  }
    
  }      
    
