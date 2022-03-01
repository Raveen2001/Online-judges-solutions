package AlgoExpert;

import java.util.*;

class Program {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
    return productSum(array, 2);
  }
	
	public static int productSum(List<Object> array, int depth){
		int productSum = 0;
		for(Object e : array){
			if(e instanceof ArrayList){
				productSum += depth * (productSum((List<Object>)e, depth + 1));
			}else{
				productSum += (int)e;
			}
		}
    return productSum;
	}
}
