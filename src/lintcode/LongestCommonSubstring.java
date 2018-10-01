package lintcode;

import java.util.Scanner;

public class LongestCommonSubstring {
	public int longestCommonSubstring(String s1,String s2) {
		int length = 0;
		int len1 = s1.length();
		int len2 = s2.length();
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
		int[][] res= new int[len2][len1];
		int maxLength = 0;
		int start = 0;
		int end = 0;
		for(int i=0; i<len1;i++)
		{
			res[0][i] = (str1[i] == str2[0] ? 1 : 0);
			for(int j=0;j<len2;j++)
			{
				res[j][0] = (str2[j] == str1[0] ? 1 : 0);
				if(i>0 && j>0)
				{
					if(str2[j] == str1[i])
					{
						res[j][i] = res[j-1][i-1]+1;
						maxLength ++;
					}
					
				}
				if(maxLength<res[j][i])
				{
					maxLength = res[j][i];
					start = i - maxLength +1;
					end = i+1;
				}
			}
			
		}
		//System.out.println(maxLength);
		//System.out.println(s1.substring(start, end));
		
		return maxLength;
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		LongestCommonSubstring worker = new LongestCommonSubstring();
		int len = worker.longestCommonSubstring(s1, s2);
		
	}

}
