package AlgoExpert;

import java.util.*;

class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    List<Integer[]> res = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		Arrays.sort(array);
		for(int i = 0; i<array.length; i++) map.put(array[i], i);
		for(int i = 0; i<array.length - 2; i++){
			map.remove(array[i]);
			for(int j = i+1; j<array.length -1; j++){
				map.remove(array[j]);
				int valueNeeded = targetSum - (array[i] + array[j]);
				if(map.containsKey(valueNeeded)){
					res.add(new Integer[]{array[i], array[j], valueNeeded});
					map.remove(valueNeeded);
				}
				// map.put(array[j], j);
			}
			
			for(int j = i+1; j<array.length; j++){
				map.put(array[j], j);
			}
		}
    return res;
  }
}



// method 2 - optimal 


import java.util.*;

class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
		Arrays.sort(array);
    List<Integer[]> triplets = new ArrayList<>();
    for(int i = 0; i< array.length - 2; i++){
			int cur = array[i];
			int left = i+1;
			int right = array.length-1;
			while(left < right){
				int curSum = cur + array[left] + array[right];
				if(curSum == targetSum){
					triplets.add(new Integer[]{cur, array[left], array[right]});
					left ++;
					right --;
				}else if(curSum < targetSum){
					left ++;
				}else{
					right--;
				}
			}
		}
		return triplets;
  }
}
