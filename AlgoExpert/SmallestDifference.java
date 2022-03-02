package AlgoExpert;

import java.util.*;

class Program {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		int minDiff = Integer.MAX_VALUE;
		int res[] = new int[2];
		int first = 0;
		int second = 0;
		int curDiff;
		while(first < arrayOne.length && second < arrayTwo.length){
			int firstNumber = arrayOne[first];
			int secondNumber = arrayTwo[second];
			if(arrayOne[first] < arrayTwo[second]){
				curDiff = arrayTwo[second] - arrayOne[first];
				first ++;
			}else if(arrayTwo[second] < arrayOne[first]){
				curDiff = arrayOne[first] - arrayTwo[second];
				second ++;
			}else{
				return new int[]{arrayOne[first], arrayTwo[second]};
			}
			if(curDiff<minDiff){
				minDiff = curDiff;
				res = new int[]{firstNumber, secondNumber};
			}
		}
		
    return res;
  }
}

