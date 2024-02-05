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
/*public class problems{
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
    }*/
    /*public class problems{
        public static void Voting(int n){
            if (n >= 18){
                System.out.println("you are eligible to vote");
            }
            else{
                System.out.println("sorry you are not eligible to vote");
            }

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age");
            int n = sc.nextInt();
            
            Voting(n);
        }
    }*/
/*public class problems{
        public static void main(String[] args) {
            int i = 0;
            do{
                System.out.println("This is an infinite loop");
            
            }
            while (i == 0);
        }
}*/ 
/*public class problems{
    public static int Power( int x, int n){
        int result =1;
        for(int i = 0; i<n;i++){
            result *= x;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        int x = sc.nextInt();
        System.out.println("Enter the exponent");
        int n = sc.nextInt();

       int res = Power(x,n);
       System.out.println("the result of "+ x +" raised to the power "+ n +" is "+res);

    } 
}*/
/*public class problems{ 
    public static void SumOfOdd(int n){
        int sum =0;
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                sum = sum + i;
 
            }
             
        }
        System.out.println(sum); 
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

       SumOfOdd(n);
       
    }
}*/
public class problems {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int largest = 0;
        int number;
        System.out.println("Enter numbers");
        do {
            number =  sc.nextInt();
            if (number != 0 && (number > largest || largest == 0)){
               largest = number;
            }
        }
        while (number != 0);
        if(largest != 0){
            System.out.println("Largest number is " + largest);
        }
        else{
            System.out.println("Invalid numbers entered");
        }
    }
}

