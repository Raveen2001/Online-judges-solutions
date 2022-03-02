package AlgoExpert;

import java.util.*;

class Program {
  public static int[] selectionSort(int[] a) {
    int smallest = -1;
		for(int i = 0; i<a.length-1; i++){
			smallest = i;
			for(int j = i+1; j<a.length; j++){
				if(a[smallest] > a[j]){
					smallest = j;
				}
			}
			if(smallest != i){
				int temp = a[smallest];
				a[smallest] = a[i];
				a[i] = temp;
			}
		}
    return a;
  }
}

