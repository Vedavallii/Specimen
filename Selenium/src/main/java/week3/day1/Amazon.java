package week3.day1;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class Amazon {
	
	public static void main(String[]args)
	{
		String name="vedavalli";
		char c[]=name.toCharArray();
		Map<Character,Integer> names=new TreeMap<Character, Integer>();
		for(int i=0;i<=c.length;i++) {
			System.out.println(c);
		
				
		if(!names.containsKey(c[i]))
		{
			names.put(c[i], 1);
		}
		else
		{
			names.put(c[i],names.get(c[i])+1);
			
		}
		for(Entry<Character,Integer> printname:names.entrySet())
		{
			System.out.println(printname);
		}
		
		}
	}
}
