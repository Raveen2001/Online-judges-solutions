package AlgoExpert;

import java.util.*;

class Program {

  public int firstNonRepeatingCharacter(String string) {
    int[] charactersCount = new int[26];
		for(char a: string.toCharArray()){
			charactersCount[((int) a) - 97] ++;
		}
		for(int i = 0; i<string.length(); i++){
			if(charactersCount[((int)string.charAt(i)) - 97] == 1) return i;
		}
    return -1;
  }
}
