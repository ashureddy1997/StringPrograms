package StringInterview;

public class RemoveSpecialCharacters {
	 public static void main(String[] args)
	    {
	    	String s="Kumar@1255#";
	    	String s2=s.replaceAll("[^a-zA-Z0-9\"]", " ");
	    	//String s2=s.replaceAll("[^0-9"]", "");
	    	//String s2=s.replaceAll("[^a-zA-Z\"]", " ");    	
		    	System.out.println(s2);		
		}
	
}
