package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UnsameString {
	public int  f2(String s) {
		//s = s.replace("\"", "");
		if(s.length()<=2)
            return 0;
		s = s.substring(1, s.length()-1);
		int[] f = new int[s.length()+1];
		
		List<Character> list = new ArrayList();
		char[] a = s.toCharArray();
		//System.out.println(a);
		
		//System.out.println(a);
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			HashMap<Character, Integer> map = new HashMap<>();
			
			for(int j=i;j<a.length;j++)
			{
				if(!map.containsKey(a[j]))
					map.put(a[j], 1);
				else {
					
					
					break;
				}
			}
			max = Math.max(max, map.size());
			//System.out.println(map.size());
			/*System.out.println(map.size());
			max = Math.max(max, map.size());*/
			//System.out.println(max);
		}
		if(a.length==1)
			max = 1;
		return max;
	}
	
	public int  f(String s) {
		s = s.replace("\"", "");
		int[] f = new int[s.length()+1];
		
		List<Character> list = new ArrayList();
		char[] a = s.toCharArray();
		for(int i=1;i<=s.length();i++)
		{
			if(!list.contains(a[i-1]))
			{
				f[i] = f[i-1]+1;
				list.add(a[i-1]);
			}
			else{
				f[i] = 0;
				list.clear();
			}
		}
		int max = 0;
		for(int i=0;i<f.length;i++)
		{
			if(f[i]>max)
				max = f[i];
		}
		//System.out.println(max);
		return max;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine().trim();
		UnsameString u = new UnsameString();
		System.out.println(u.f2(string));
		
	}

}
