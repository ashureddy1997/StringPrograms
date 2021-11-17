package StringInterview;


public class ReverseEachWords {

	public static void main(String[] args) {
		String blogName = "My name is siddaraj";
		StringBuilder reverseString = new StringBuilder();
		 
		String[] words = blogName.split(" ");       //step 1
		 
		for (String word : words) 
		{
		    String reverseWord = new StringBuilder(word).reverse().toString();      //step 2
		    reverseString.append(reverseWord + " ");                                //step 3
		}
		 
		System.out.println( reverseString.toString().trim() ); 

	}

}
