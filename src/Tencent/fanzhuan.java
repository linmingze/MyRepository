package Tencent;

import java.util.Scanner;

public class fanzhuan {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int m = scanner.nextInt();
	
	
	//System.out.println(m+" "+n);
	//int[] a = new int[n+1];
	int tmp;
	int t = n/m;
	long sum = 0;
	for(int i=0;i<t;i++)
		
	{
		for(int j=0;j<m;j++)
		{
			if(i%2==0)
				tmp =0- (i*m+j+1);
			else
				tmp =(i*m+j+1);
			sum = sum+tmp;
			//8System.out.println(a[i*m+j]);
		}
		
	}
	/*for(int i=1;i<=n;i++)
	{
		if(i%(m+1)==0)
			a[i] = i;
		else
			a[i] = 0-i;
		sum = sum+a[i];
	}*/
	System.out.println(sum);
}
}
