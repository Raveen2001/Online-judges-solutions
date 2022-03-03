package AlgoExpert;

import java.util.*;

class Program {
  public static boolean isMonotonic(int[] array) {
    if(array.length <=2*/) return true;
		boolean nonIncreasing = false;
		int right = array.length - 1;
		while(right >= 0){
			if(array[right] > array[0]){
				break;
			}
			if(array[right] < array[0]){
				nonIncreasing = true;
				break;
			}
			right --;
		}
		System.out.println(right + " " + nonIncreasing);
		for(int i = 0; i<array.length - 1; i++){
			if(nonIncreasing && array[i+1] > array[i]) return false;
			else if(!nonIncreasing && array[i+1] < array[i]) return false;
		}
    return true;
  }
}

