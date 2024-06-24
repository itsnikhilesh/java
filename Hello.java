import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
         System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int c=num%10;
        while (num!=0) {
            if(c>num%10){c=num%10;}
            num=num/10;
        }
        System.out.println(c);

    }
}
