import java.util.*;

/*public class  greaternumber{
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
*/
public class problems{
    public static  double Circumference(double r){
        if ( r == 0){
            System.out.println("circle doesn't exist");
            return 0;
        }
        else{
            return 2*3.14*r; 
        }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the radius of circle");
            int r = sc.nextInt();

            double cir=Circumference(r);
            System.out.println("circumference of circle is " + cir);

        }

    }