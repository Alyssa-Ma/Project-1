//Authors: Lily Li & Alyssa Ma
//Title: Project 1: Method Madness
//Date Created: October 5th 2017
//Date Completed: 
public class Runner {
	public static void main (String [] args) {
		boolean palindromeResult = LLiProject1.isPalindrome("noon");
		int sumUpToResult = LLiProject1.sumUpTo(3);
		String vigMessage = LLiProject1.vigCipher("ATTACK AT DAWN", "LEMON");
		
		System.out.println(palindromeResult);
		System.out.println(sumUpToResult);
		System.out.println(vigMessage);
		System.out.println(AMaProject1.dateStrstring("05/12/1965"));
		AMaProject1.multiplicationtable(6, 8);
		System.out.println(AMaProject1.cutOut("onetwothree, ne"));
		//cuts out first instance of a period
	}
}