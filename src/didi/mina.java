package didi;

import java.util.Scanner;

//最大子数组和
public class mina {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] strings = scanner.nextLine().split(" ");
		int[] a = new int[strings.length];
		for(int i=0;i<strings.length;i++)
		{
			a[i] = Integer.parseInt(strings[i]);
		}
		int res = Integer.MIN_VALUE;
		int sum=0;
		for(int i=0; i<a.length; i++)
        {
            sum += a[i];
            if(sum > res)
            {
                res = sum;
            }
            if(sum < 0)
            {
                sum = 0;   //子串和为负数，丢掉
            }
        }
		System.out.println(res);
        

	}

}
