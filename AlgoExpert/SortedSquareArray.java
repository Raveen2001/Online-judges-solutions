package AlgoExpert;

import java.util.*;
import java.lang.Math;

class Program {

  public int[] sortedSquaredArray(int[] array) {
    int left = 0;
		int right = array.length - 1;
		int[] res = new int[array.length];
		for(int i = 0; i<array.length; i++){
			if(Math.abs(array[left]) > Math.abs(array[right])){
				res[array.length-1-i] = array[left] * array[left];
				left ++;
			}else{
				res[array.length-1-i] = array[right] * array[right];
				right--;
			}
		}
    return res;
  }
}

