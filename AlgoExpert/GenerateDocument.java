package AlgoExpert;

import java.util.*;

class Program {

  public boolean generateDocument(String characters, String document) {
    Map<Character, Integer> characterCounts = new HashMap<>();
		for(char a: characters.toCharArray()){
			characterCounts.put(a, characterCounts.getOrDefault(a, 0) + 1);
		}
		
		for(char a: document.toCharArray()){
			if(!characterCounts.containsKey(a) || characterCounts.get(a) == 0) return false;
			characterCounts.put(a, characterCounts.get(a) - 1);
		}
    return true;
  }
}

