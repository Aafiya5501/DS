import java.util.*;
public class lab5_1{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int [][] a=new int[3][2];
        int [][] b=new int[2][3];

        System.out.println("Enter Elements of 1st Array : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Elements of 2nd Array : ");
        for(int j=0;j<2;j++){
            for(int k=0;k<3;k++){
                b[j][k]=sc.nextInt();
            }
        }

        int [][] ans=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<2;k++){
                    ans[i][j]+= a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Result : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(ans[i][j]+"\t ");
            }
            System.out.println();
        }
        sc.close();
    }
}