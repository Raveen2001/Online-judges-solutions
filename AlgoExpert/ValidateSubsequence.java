package AlgoExpert;

import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		int pointer = 0;
    for(int num: array){
			if(num == sequence.get(pointer)){
				pointer ++;
			}
			if(pointer == sequence.size()){
				return true;
			}
		}
		// if(pointer == sequence.size()){
		// 	return true;
		// }
    return false;
  }
}

