package Tencent;

import java.util.Scanner;

public class money {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int counta = scanner.nextInt();
		int b = scanner.nextInt();
		int countb = scanner.nextInt();
		int maxcount;
		int mincount;
		int max = Math.max(a, b);
		/*if(max ==a)
		{
			maxcount = counta;
			mincount = countb;
		}
		else
		{
			maxcount = countb;
			mincount = counta;
		}
		int c1=0;
		int c2=0;
		int min = Math.min(a, b);
		if(maxcount*max>n)
			*/
		int res = 0;
		for(int i=0;i<counta;i++)
		{
			int sum=0;
			sum = sum+i*a;
			int y = (n-sum)%b;
			float x = (n-sum)/b;
			if(y==0 && x<=countb )
				res++;
			
		}
		System.out.println(res);
	}

}
