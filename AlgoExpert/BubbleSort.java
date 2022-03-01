package AlgoExpert;


import java.util.*;

class Program {
  public static int[] bubbleSort(int[] a) {
    boolean isSorted = false;
		int stop = 1;
		while(!isSorted){
			isSorted = true;
			for(int i = 0; i<a.length - stop; i++){
				if(a[i] > a[i+1]){
					swap(i, i+1, a);
					isSorted = false;
				}
			}
			stop ++;
		}
		return a;
  }
	
	public static void swap(int i, int j, int[] a){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
