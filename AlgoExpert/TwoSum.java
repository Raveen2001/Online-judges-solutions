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


// solution 2


import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    Arrays.sort(array);
		int left = 0;
		int right = array.length - 1;
		while(left < right){
			int sum = array[left] + array[right];
			if(sum == targetSum){
				return new int[]{array[left], array[right]};
			}else if(sum > targetSum){
				right--;
			}else{
				left++;
			}
		}
		
    return new int[0];
  }
}

