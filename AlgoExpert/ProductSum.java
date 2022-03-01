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



// 2 method


import java.util.*;

class Program {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
    return productSum(array, 1);
  }
	
	public static int productSum(List<Object> array, int depth){
		int productSum = 0;
		for(Object e : array){
			if(e instanceof ArrayList){
				@SuppressWarnings("unchecked")
				List<Object> ls = (List<Object>)e;
				productSum += productSum(ls, depth + 1);
			}else{
				productSum += (int)e;
			}
		}
    return depth * productSum;
	}
}

