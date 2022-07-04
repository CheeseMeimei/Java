import java.util.Scanner;
public class heshang{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=sc.nextInt();
		int max=a1>a2?a1:a2;
		max=max>a3?max:a3;
		System.out.println(max);
	}
}