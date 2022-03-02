package AlgoExpert;

import java.util.*;

class Program {
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
		int right = array.size();
    for(int i = array.size() - 1; i>=0; i--){
			if(array.get(i) == toMove) right --;
			else break;
		}
		if(right == 0) return array;
		right --;
		for(int i = 0; i<right; i++){
			if(array.get(i) == toMove){
				swap(array, i, right);
				while(array.get(--right) == toMove);

			}
		}
    return array;
  }
	
	public static void swap(List<Integer> array, int i, int j){
		int temp = array.get(i);
		array.set(i, array.get(j));
		array.set(j, temp);
	}
}



