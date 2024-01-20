import java.util.*;

public class calculator {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Press 1 for addition");
         System.out.println("Press 2 for subtraction");
         System.out.println("Press 3 for multiplication");
         System.out.println("Press 4 for division");
         System.out.println("Press 5 for remainder");
         int button = scanner.nextInt();

         switch (button){
            case 1: 
            int addition = a + b;
            System.out.println( addition);
            break;

            case 2:
            int subtraction =  a - b;
            System.out.println( subtraction);
            break;

            case 3:
            int mul = a * b;
            System.out.println(mul);
            break;

            case 4:
            int div = a / b;
            System.out.println( div);
            break;

            case 5:
            int rem = a % b;
            System.out.println(rem);
            break;

            default: System.out.println("Invalid button");

         }
         

    
    }
    
}
