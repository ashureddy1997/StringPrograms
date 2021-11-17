package StringInterview;

import java.util.HashMap;
import java.util.Iterator;

public class FindDuplicateCharacter {
	public static void main(String[] args)
	{

		findDuplicatecharacter("aabgvfgg");
	}

	private static void findDuplicatecharacter(String str) {
		HashMap<Character, Integer> hm=new HashMap<>();	
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(hm.get(c)!=null)
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		/*Iterator<Character> tempString=hm.keySet().iterator();
		while (tempString.hasNext()) 
		{
			Character temp=tempString.next();
			if(hm.get(temp)>1)
			{
				System.out.println("the character " + temp + " appeared " + hm.get(temp) + "no of times");
			}

		}*/
	}

}

