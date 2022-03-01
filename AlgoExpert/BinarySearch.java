package AlgoExpert;
import java.util.*;

class Program {
  public static int binarySearch(int[] array, int target) {
    return binarySearch(array, target, 0, array.length-1);
  }
	
	public static int binarySearch(int[] array, int target, int left, int right){
		if(left > right) return -1;
		int mid = (left + right)/2;
		int potentialMatch = array[mid];
		if(target == potentialMatch) return mid;
		else if(target<potentialMatch) return binarySearch(array, target, left, mid-1);
		else return binarySearch(array, target, mid+1, right);
	}
}
