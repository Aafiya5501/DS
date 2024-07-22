import java.util.Scanner;
public class lab5_2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        
        int[][] a= new int[2][2];
        int[][] b = new int[2][2];
        System.out.println("First array:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        

        System.out.println("Second array:");

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                b[i][j]= sc.nextInt();
            }
        }
        int[][] c = new int[2][2];
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j]= a[i][j]+b[i][j];
            }
        }
        System.out.println("Addition of both arrays is:");
         for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println(c[i][j]);
            }
        }
    }

         
    }
