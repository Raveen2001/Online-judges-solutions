package AlgoExpert;

import java.util.*;

class Program {
  public static int[] insertionSort(int[] a) {
    // Write your code here.
		for(int i = 1; i<a.length; i++){
			for(int j = i-1; j>=0; j--){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}else{
					break;
				}
			}
		}
    return a;
  }
}
