package week3.day1;import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UniqueChar {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Map<Character,Integer> Unique=new LinkedHashMap<Character, Integer>();
		String s="Infosys Limited";
		String s1=s.replace(" ", ",");
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(!Unique.containsKey(c[i])) {
				Unique.put(c[i],1);
		}
			else
		{
			Unique.put(c[i], Unique.get(c[i])+1);

		}
	}
	for(Entry<Character,Integer> name :Unique.entrySet())
	{
		/*if(!(name.getValue()>1))
		{
			System.out.println(name.getKey());
		}*/
		
		/*if((name.getValue()==2))
		{
			System.out.println(name.getKey());
		}*/
		if(name.getValue()>1)
		{
			System.out.println(name.getKey());
		}
		
	}



	}}




