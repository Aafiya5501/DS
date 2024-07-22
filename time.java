import java.util.Scanner;
public class time{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int h=n/3600;
		int m=(n%3600)/60;
		int s2=n%60;
		System.out.println(+h+":"+m+":"+s2+"");





	}
}