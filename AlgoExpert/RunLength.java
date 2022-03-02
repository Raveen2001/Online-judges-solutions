package AlgoExpert;

import java.util.*;

class Program {
  public String runLengthEncoding(String string) {
		StringBuilder res = new StringBuilder();
		int freq = 1;
		char prev = string.charAt(0);
		for(int i = 1; i<string.length(); i++){
			char a = string.charAt(i);
			if(a != prev || freq == 9){
				res.append(freq);
				res.append(prev);
				freq = 0;
			}
			prev = a;
			freq ++;
		}
		res.append(freq);
		res.append(prev);
		return res.toString();
  }
}
