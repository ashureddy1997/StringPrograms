package StringInterview;

import java.util.HashMap;
import java.util.Iterator;

public class FindDuplicateWords {
	public static void main(String[] args)
	{

		findDuplicateWord("I am Learning Java Java");
	}

	private static void findDuplicateWord(String str) {
		HashMap<String, Integer> hm=new HashMap<>();			
		String [] s=str.split(" ");

		for(String tempString:s)
		{
			if(hm.get(tempString) !=null)
			{
				hm.put(tempString, hm.get(tempString)+1);
			}
			else
			{
				hm.put(tempString, 1);
			}

		}
		//System.out.println(hm);
		Iterator<String> tempString=hm.keySet().iterator();
		while (tempString.hasNext()) 
		{
			String temp=tempString.next();
			if(hm.get(temp)>1)
			{
				System.out.println("the word " + temp + " appeared " + hm.get(temp) + "no of times");
			}			
		}
	}
}
