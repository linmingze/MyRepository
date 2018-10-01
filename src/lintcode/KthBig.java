package lintcode;

import java.util.Scanner;
import java.util.Vector;

public class KthBig {
	public int getK(int[] nums,int k) {
		return 0;
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = Integer.valueOf(s.nextLine());
		
		String str = s.nextLine();
		String[] strs = str.split(" ",-1);
		int[] nums = new int[strs.length];
		for(int i = 0;i < nums.length;i++)
		{
			nums[i] = Integer.valueOf(strs[i]);
			System.out.println(nums[i]);
		}
		
		/*Vector<Integer> nums = new Vector();
		while(s.hasNext())
		{
			nums.addElement(Integer.valueOf(s.nextInt()));
		}
		for(Integer x:nums)
		{
			System.out.println(x);
		}*/
	}

}
