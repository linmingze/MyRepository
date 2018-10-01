package dp;

import java.util.Scanner;

public class fibonaq {
	
	public static int f(int n) {
		if(n==0)
			return 0;
		if(n == 1 )
			return 1;
		
		return f(n-1)+f(n-2);
		
	}
	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();*/
		System.out.println(f(5));
		int n=5;
		int a = 1;
		int b=1;
		int res = 0;;
		for(int i=3;i<=n;i++)
		{
			res = a + b;
			a = b;
			b = res;
			
			System.out.println("i="+i+" "+res);
		}
		
	}

}
