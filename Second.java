import java.util.Scanner;
public class Second
{
    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
       System.err.print("Enter your first Number  :  ");
       int x = sc.nextInt();
       System.out.print("Enter your second Number :  ");
       int y = sc.nextInt();

       int z;
       z=x*y;
       System.out.print("This is your result(x+y) = :  "+z);

    }
}
