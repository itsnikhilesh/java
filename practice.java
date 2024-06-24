import java.util.*;
public class practice {
       public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number : ");
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c= a*b;
        // System.out.println("Area of rectangle is : " +c);
        System.out.print("Enter the year to check leap year : ");
        int y =sc.nextInt();

        if(y%4==0 && y%400==0)
        {
            System.out.println("y is leap year ");
        }
        else
        {
            System.out.println("y is not leap year");
        }
       }    
}
