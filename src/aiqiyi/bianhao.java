package aiqiyi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class bianhao {
	/*public static long dfs(Map<Integer, Set<Integer>> map,int n,int i,Map<Integer, Set<Integer>> map2,long res) {
		
		if(i<n-1){
				if(map.get(i).size()>0){
					for(Integer tmp:map.get(i))
					{
						if(map2.get(i).contains(tmp)){
							for(int j=0;j<n;j++)
							{
								map2.get(j).remove(tmp);
							}
							//res = res + 
							return (long)(map2.get(i).size()+1) * dfs(map, n, i, map2);
						}
						return (long)(map2.get(i).size()) * dfs(map, n, i, map2);
					}
				}
				else
					return 0;
			
			
		}
		else
			
			return (long)map2.get(n-1).size();
		//return 1;
	}*/
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine().trim();
		int n = Integer.parseInt(s);
		String[] strings = scanner.nextLine().trim().split(" ");
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			
			a[i] = Integer.valueOf(strings[i]);
		}
		
		HashMap<Integer, Set<Integer>> map= new HashMap<>();
		HashMap<Integer, Set<Integer>> map2= new HashMap<>();
		for(int i=0;i<n;i++)
		{
			Set<Integer> set= new HashSet<>();
			for(int j=1;j<=a[i];j++)
				set.add(j);
			map.put(i, set);
			
		}
		map2.putAll(map);
		long t = 1000000007l;
		long res = 1;
		//dfs(map, n, 0, map2,res);
		System.out.println(res%t);
		/*Arrays.sort(a);
		for(int i=0;i<n;i++ )
		{
			
		}*/
	}

}
