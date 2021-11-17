package StringInterview;

public class occuranceCharacter {
	    public static void main(String[] args)
	    {
	        String s = "abc";	 
	        char c = 'a';
	        int count = s.length() - s.replace("a", "").length();
	        System.out.println("Number of occurances of 'a' in "+s+" = "+count);
	    }
	}

