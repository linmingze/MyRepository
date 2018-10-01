package aiqiyi;

import java.util.Scanner;

public class sqr {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				int a = (int) Math.sqrt(i*j);
				if(a*a==i*j)
					count++;
			}
		}
		System.out.println(count);
	}
	

}
