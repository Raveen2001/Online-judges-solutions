package AlgoExpert;

import java.util.*;

class Program {
  public static String caesarCypherEncryptor(String str, int key) {
    String alphabets = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder res = new StringBuilder();
		key = key%26;
		for(char a : str.toCharArray()){
			res.append(getNewLetter(a, key, alphabets));
		}
    return res.toString();
  }
	
	public static char getNewLetter(char c, int key, String alphabets){
		int newLetterCode = alphabets.indexOf(c) + key;
		return alphabets.charAt(newLetterCode % 26);
	}
	
	
}

