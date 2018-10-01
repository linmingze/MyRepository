package dfs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class xinyongka {
	public static int dfs(Map<String, HashSet<String>> map,String a,Map<String, Boolean> v,int len) {
		
		/*if(map.get(a).size()<=0)
			len =  0;
		else
			len = len +1;*/
		len = 0;
		while(map.get(a).size()>0)
		{
			HashSet<String> set = new HashSet<String>();
			for(String s:map.get(a))
			{
				
				if(!v.containsKey(s))
				{
					len = len +1;
					if(map.containsKey(s))
					{
						set.addAll(map.get(s));
						//map.get(a).addAll(map.get(s));
					
					}
					//map.get(a).remove(s);
					v.put(s, true);
					//dfs(map, a, v,len);
				}
				
			}
			map.get(a).clear();
			map.put(a,  set);
		}
		/*for(String s:map.get(a))
		{
			if(!v.containsKey(s))
			{
				if(map.containsKey(s))
				{
					map.get(a).addAll(map.get(s));
				
				}
				map.get(a).remove(s);
				v.put(s, true);
				dfs(map, a, v,len);
			}
			
		}*/
		return len;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] tmp = scanner.nextLine().split(" ");
		int m = Integer.valueOf(tmp[0]);
		int n = Integer.valueOf(tmp[1]);
		Map<String, HashSet<String>> map = new HashMap<>();
		Map<String, Boolean> v = new HashMap<>();
		HashSet<String> res = new HashSet<>();
		for(int i=0;i<m;i++)
		{
			tmp = scanner.nextLine().trim().split(" ");
			HashSet<String> set = new HashSet<>();
			if(!tmp[1].equals("*")){
				set.add(tmp[1]);
				v.put(tmp[1], false);
			}
			if(!tmp[2].equals("*"))
			{
				set.add(tmp[2]);
				v.put(tmp[2], false);
			}
			map.put(tmp[0], set);
		}
		
		
		
		for(String s:map.keySet())
		{
			Map<String, Boolean> v1 = new HashMap<>();
			//System.out.println(v1.size());
			/*for(String s2:map.keySet())
			{
				
				v.put(s2, false);
				
				
			}*/
			int l = 0;
			//System.out.println(map.get(s));
			int x = dfs(map, s,v1,l);
			if(x>=n)
				res.add(s);
			
		}
		Iterator<String> test = res.iterator();
		if(n>0){
			if(res.size()<=0)
				System.out.println("None");
			else{
				while(test.hasNext()){
					String teString = test.next();
					System.out.print(teString+" ");
				}
			}
		}
		else{
			for(String s:map.keySet())
				System.out.print(s+" ");
		}
		
		
	}

}
