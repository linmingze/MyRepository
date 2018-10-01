package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class last {
	public static void main(String[] args) {
		HashMap<Character, Integer> map=new HashMap<>(); 
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine().trim();
		//System.out.println("23323");
		System.out.println(s);
		char[] c = s.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			if(!map.containsKey(c[i]))
			{
				map.put(c[i], 1);
			}
			else {
				map.put(c[i],map.get(c[i])+1);
			}
		}
		String last= "NULL"; 
		for(int i=0;i<c.length;i++)
		{
			if(map.get(c[i])==1)
				last= String.valueOf(c[i]);
			
		}
		System.out.println(last);
		System.out.println("b ");
		/*String xString = " 12 43";
		char[] c = xString.toCharArray();
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]+"p");
		map.put(" ".toCharArray()[0], 1);
		map.put("12".toCharArray()[0], 1);
		System.out.println(map);*/
		
	}

}
