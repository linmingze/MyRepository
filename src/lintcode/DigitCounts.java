package lintcode;

import java.util.Scanner;

public class DigitCounts {
	
	public int digitCounts(int k, int n) {
		int  sum = 0;
		int count = 0;
		String key = String.valueOf(k);
		for(int i = 0;i < n+1;i++)
		{
			String s = String.valueOf(i);
			count = s.length() - s.replace(key, "").length();
			sum = sum + count;
		}
        // write your code here
		return sum;
    }
	
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		int k = x.nextInt();
		int[] a={1,2,3,4};
		//Arrays.sort(arr);
		DigitCounts d = new DigitCounts();
		System.out.println(d.digitCounts(k, n));
	}

}
