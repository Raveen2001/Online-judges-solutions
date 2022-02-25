package AlgoExpert;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    
  public static int[] twoNumberSum(int[] array, int targetSum) {
    Set<Integer> set = new HashSet<>();
		for(int num: array){
			int potentialMatch = targetSum - num;
			if(set.contains(potentialMatch)){
				return new int[]{num, potentialMatch};
			}else{
				set.add(num);
			}
		}
		return new int[0];
  }
}

