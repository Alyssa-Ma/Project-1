//Author: Lily Li
//Date Created: 10/5/2017
// Date Completed:

public class LLiProject1 {
	public static boolean isPalindrome(String word) {
		String foward = " ", backward = " ";
		char[] characters = word.toCharArray();
		int index = characters.length - 1;
	    for(int f = 0; f<= index; f++) {
	    	foward+=characters[f];
	    	//System.out.println(foward);
	    }
	    for(int b = index; b >= 0; b--) {
	    	backward+=characters[b];
	    	//System.out.println(backward);
	    }
	    return(foward==backward);   
	}
	
	public static int sumUpTo(int integer) {
		int num = integer - 1, sum = integer;
		while(num != 0) {
			sum += num;
			num--;
		}
		//System.out.println(sum);
		return sum;
	}
}
