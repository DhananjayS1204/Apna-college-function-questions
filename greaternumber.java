import java.util.*;

public class  greaternumber{
    public static void greaterNumber( int a, int b){
        if(a > b){
            System.out.println("first number is greater than second");
        }
        else {
            System.out.println("Second number is greater than first");
        }
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();

            greaterNumber(a,b);
        }
    }
