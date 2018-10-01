package Tencent;

import java.util.Scanner;

public class qiaokeli {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		float x = (float) (2-1/(Math.pow(2, n-1)));
		//System.out.println(x);
		int res=0;
		for(int i=0;i<m;i++)
		{
			if(i*x>=m)
			{
				res = i;
				break;
			}
		}
		System.out.println(res);
	}
	

}
