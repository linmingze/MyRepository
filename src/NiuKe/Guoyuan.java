package NiuKe;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * 又到了丰收的季节，恰逢小易去牛牛的果园里游玩。
牛牛常说他对整个果园的每个地方都了如指掌，小易不太相信，所以他想考考牛牛。
在果园里有N堆苹果，每堆苹果的数量为ai，小易希望知道从左往右数第x个苹果是属于哪一堆的。
牛牛觉得这个问题太简单，所以希望你来替他回答。

输入描述:
第一行一个数n(1 <= n <= 105)。
第二行n个数ai(1 <= ai <= 1000)，表示从左往右数第i堆有多少苹果
第三行一个数m(1 <= m <= 105)，表示有m次询问。
第四行m个数qi，表示小易希望知道第qi个苹果属于哪一堆。


输出描述:
m行，第i行输出第qi个苹果属于哪一堆。

输入例子1:
5
2 7 3 4 9
3
1 25 11

输出例子1:
1
5
3**/
public class Guoyuan {
	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		int[] count = new int[n+1];
		for(int i=0;i<n;i++)
		{
			a[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		int[] b = new int[m];
		int[] c = new int[m];
		int nsum = 0;
		for(int i=0;i<n;i++)
		{
			nsum = nsum+a[i];
			count[i+1] = nsum; 
			//System.out.print(count[i]+",");
			
		}
		//System.out.println("");
		for(int i=0;i<m;i++)
		{
			int l=0;
			int r = n+1;
			int mid = 0; 
			b[i] = scanner.nextInt();
			while(r>=l)
			{
				 mid = (l+r)/2;                                                                                                                     
				if(count[mid] > b[i] )
				{
					r =mid-1;
				}
				else if(count[mid] < b[i])
				{
					l = mid +1;
				}
				else{
					break;
				}
				//System.out.println(mid);
				//
			}
			System.out.println(l);
			
		}
			
		/*Set<Integer> set = new HashSet<>();
		TreeSet<Integer> tSet = new TreeSet<>();
		
		//Integer[] d= (Integer[]) set.toArray();
		 
		//Arrays.sort(b);
		for(int i=0;i<m;i++)
		{
			System.out.println(b[i]);
		}
		long sum = 0;
		long last = sum;
		int min = 0;
		long[] g = new long[n+2];
		g[n+1] = Long.MAX_VALUE;
		g[0] = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		long nsum = 0;
		for(int i=0;i<n;i++)
		{
			nsum = nsum + a[i]; 
			g[i+1] = nsum;
			
			///g[i] = g[i-1]+
		}
		int figer = 0;
		int t = 0;
		for(int i:tSet)
		{
			
			for(;t<n+1;t++)
			{
				if(g[t]>i)
				{
					map.put(i, t);
					break;
				}
			}
		}*/
		/*for(int i=0;i<n;i++)
		{
			last = sum;
			sum = sum +a[i];
			if(last<tSet.first() && sum>tSet.first() && tSet.size()>0 )
			{
				
				map.put(tSet.first(), i+1);
				//min = min+1;
				tSet.remove(tSet.first());
			}
			
		}*/
		/*if(tSet.size()>0)
			map.put(tSet.first(), n);*/
		/*if(map.size()<m)
			map.put(b[m-1], n);*/
		/*System.out.println(map);
		for(int i=0;i<m;i++)
		{
			System.out.println(map.get(c[i]));
		}*/
	}
	
	

}
