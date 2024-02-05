import java.util.*;
/*public class learning{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();

        int number[] = new int[size];

        System.out.println("Enter elements of array ");
        for(int i=0;i<number.length;i++){
            number[i]= sc.nextInt();
        }

        System.out.println("which number you want to find?? ");
        int x = sc.nextInt();

        for(int i=0;i<number.length;i++){
            if(number[i] == x){
                System.out.println("Number found at index " + i);
            }
        }
        
    }
}*/ 
public class learning{
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your choice");
    System.out.println("1 for area of circle");
    System.out.println("2 for area of rectangle ");
    int choice = sc.nextInt();

    switch (choice){
        case 1:
        if (choice ==  1){
        
            int area[] = new int[1];

            System.out.println("Enter radius of cirle");
            area[0] =  sc.nextInt();
            double Area = 3.14 * area[0] * area[0];
            System.out.println("Area of circle is " + Area );
        }
        break;

        case 2:
        if (choice == 2){
            int area[] = new int[2];

            System.out.println("Enter length and breadth of rectangle");
            area[0] = sc.nextInt();
            area[1] = sc.nextInt();
            int Area = area[0] * area [1];
            System.out.println("Area of rectangle is " + Area);
        }
        break;

        default: 
        System.out.println("INVALID INPUT");
        break;
}
    }

}