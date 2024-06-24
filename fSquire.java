import java.util.*;
public class fSquire {
    

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);

        System.out.println("print the number by user : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        int sum = add(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}