//Author: Lily Li
//Date Created: 10/5/2017
// Date Completed: 10/12/2017

public class LLiProject1 {
	public static boolean isPalindrome(String word) {
		String backward = "";
		char[] characters = word.toCharArray();
		int index = characters.length - 1;
	
	    for(int i = index; i >= 0; i--) {
	    	backward+=characters[i];
	    }
	    	
	    return(word.equals(backward));   
	}
	
	public static int sumUpTo(int integer) {
		int num = integer - 1, sum = integer;
		while(num != 0) {
			sum += num;
			num--;
		}
		return sum;
	}	
	
	//Vigenere Cipher Encoder
	public static String vigCipher(String message, String key) {
		char[] keyCharacters = key.toCharArray(), msgCharacters = message.toCharArray();
		int keyLength = keyCharacters.length, msgLength = msgCharacters.length, i = 0, num;
		int keyNum[] = new int[keyLength];
		String vigMsg = "";
		
		for(int x = 0; x <= msgLength - 1; x++) {
			if(i > keyLength - 1) {//Enable pattern for key word to start over
				i = 0;
			}
			
	    	keyNum[i] = letterToNum(keyCharacters[i]);
	    	
	    	if(msgCharacters[x] == (char)32) {//this is for the spaces in the message
	    		vigMsg += " ";	
	    	}
	    	else //find the num on the number chart 0-25
	    	{
		    	num = msgCharacters[x] - 'A' + keyNum[i]; 
		    	
		    	if(num >=26) {
		    		num-=26;
		    		vigMsg += numToLetter(num);
		    		i++;
		    	}
		    	else {
		    		vigMsg += numToLetter(num);
		    		i++;
		    		
		    	}
	    	}	
		} 
		
		return vigMsg;
	}
	
	private static int letterToNum(char letter) {
		return(letter - 'A');
	}
	
	private static char numToLetter(int num) {
		char alphabet[] = new char[26];
		
		for(int i = 0; i <=25; i++) {
			alphabet[i] = (char)(65+i); 
		}
		
		return(alphabet[num]);
	}
	
}