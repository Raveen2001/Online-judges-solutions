package AlgoExpert;

import java.util.*;

class Program {
  public static int[] findThreeLargestNumbers(int[] array) {
    int l1 = Integer.MIN_VALUE, l2 = l1, l3 = l2;
		for(int i = 0; i<array.length; i++){
			if(array[i] > l1){
				l3 = l2;
				l2 = l1;
				l1 = array[i];
			}else if(array[i] > l2){
				l3 = l2;
				l2 = array[i];
			}else if(array[i] > l3){
				l3 = array[i];
			}
		}
    return new int[]{l3, l2, l1};
  }
}
