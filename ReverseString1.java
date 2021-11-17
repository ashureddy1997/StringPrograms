package StringInterview;

public class ReverseString1 {
	public static void main(String[] args) {
		String s="The temple is at top of the hill";

		String s1[]=s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
		System.out.println();
	}
}
