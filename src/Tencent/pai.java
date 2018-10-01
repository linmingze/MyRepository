package Tencent;

import java.util.Arrays;
import java.util.Scanner;

public class pai {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = Integer.valueOf(scanner.nextLine());
		int[] a = new int[m];
		String[] strings = scanner.nextLine().split(" ");
		for(int i=0;i<m;i++)
			a[i] = Integer.valueOf(strings[i]);
		Arrays.sort(a);
		
		int x=a.length-1;
		long sum1=0;
		long sum2 = 0;
		while(x>=0)
		{
			if(x>=0)
			{
				sum1 = sum1+a[x];
				x--;
			}
			if(x>=0)
			{
				sum2 = sum2+a[x];
				x--;
			}
		}
		System.out.println(sum1-sum2);
	}

}
