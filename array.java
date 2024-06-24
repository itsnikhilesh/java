import java.util.*;
public class array {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        // System.out.println("Enter the element in the array");
        // int arr[]=new int[5];

        // for(int i=0;i<5;i++)
        // {
        //     arr[i]=sc.nextInt();
           
        // }
        // System.out.println("Array eles are");
        // for(int j=0;j<5;j++)
        // {
        //     System.out.print(arr[j]+" ");

        // }


        // System.out.println("print 2d array");

        // int[][] a = new int[3][];
        // a[0] = new int[5];
        // a[1] = new int[2];
        // a[2] = new int[4];

        
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a[i].length; j++) {
        //         a[i][j] = sc.nextInt();
        //     }
        // }

        
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a[i].length; j++) {
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        //max value of the array
        // System.out.println("print the max array");
        // int  a[]= new int [5];
        // int maxi =a[0];
        // for(int i=0;i<=4;i++)
        // {
        //     a[i]=sc.nextInt();
        // }
        // for(int i=1;i<a.length;i++)
        // {
        //     if(a[i]>maxi){
        //     maxi=a[i];
        //     }
            
        // }
        // System.out.println("The max value of the arrayis : "+maxi);

        System.out.println("Print the transpose the matrixes");
        int arr[][]=new int[3][3];
        
        //int trans[][];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
               arr[i][j]=sc.nextInt();
            }

        }
        int mat[][]=new int[3][3];
         System.out.println("original Array is : ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
                mat[j][i]=arr[i][j];
            }
            System.out.println();
        }
        
        System.out.println("Transposed matrix is: ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(mat[i][j]+" ");
                
            }
            System.out.println();
        }

    }

}