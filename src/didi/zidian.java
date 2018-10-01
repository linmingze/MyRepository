package didi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class zidian {
	public static void main(String[] args) {
		Map<String, HashSet<Integer>> map = new HashMap<>();
		map.put("k1", new HashSet<Integer>());
		map.put("k2", new HashSet<Integer>());
		int[] a = {1,2,3,4,5,5,6,6,7,8,9,10};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<5)
				map.get("k1").add(a[i]);
			else
				map.get("k2").add(a[i]);

		}
		System.out.println(map);
		}
	    

}
