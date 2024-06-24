import java.util.*;
public class factorial {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int j=1;
        int i = sc.nextInt();
        while(i>0)
        {
            j =j*i;
            i--;
            sc.close();
        }
        System.out.println(j);
    }
}
