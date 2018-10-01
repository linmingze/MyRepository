package lintcode;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WindowMiddle {
	public double[] middle(int[] x,int k) {
		double[] res = new double[x.length-k+1];
		return res;
		
	}
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		/*int m = x.nextInt();
		int[] number = new int[m];
		for(int i= 0;i < m;i++)
		{
			number[i] = x.nextInt();
		}
		System.out.println(Arrays.toString(number));*/
		String input =x.nextLine();
		String[] str = input.split(" ");
		int[] res = new int[str.length];
		for(int i = 0;i < res.length;i++)
		{
			res[i] = Integer.valueOf(str[i]);
		}
		System.out.println(Arrays.toString(res));
		
		
		
		
		
	}

}
