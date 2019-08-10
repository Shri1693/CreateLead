package week3.day2;


import java.util.LinkedHashMap;
import java.util.Map;

public class CompanyName 
{
	public static void main(String[] args) 
	{
		String cmpnyName = "TESTLEAF";
		char[] ch = cmpnyName.toCharArray();
		Map<Character,Integer> Company = new LinkedHashMap<Character,Integer>();
		for(char c : ch)
		{
			if(Company.containsKey(c))
			{
				Integer integer = Company.get(c)+1;
				Company.put(c, integer);
			}
			else
			{
				Company.put(c,1);
			}
		}
		System.out.println(Company);
	}
}
