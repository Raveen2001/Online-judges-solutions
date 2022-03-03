package AlgoExpert;
import java.util.*;

class Program {
  public int[] arrayOfProducts(int[] a) {
    int[] leftProduct = new int[a.length];
		int[] rightProduct = new int[a.length];
		int[] res = new int[a.length];
		leftProduct[0] = 1;
		rightProduct[a.length - 1] = 1;
		for(int i = 1; i<a.length; i++){
			leftProduct[i] = leftProduct[i-1] * a[i - 1];
			rightProduct[a.length - i - 1] = rightProduct[a.length - i] * a[a.length - i];
		}
		
		for(int i = 0; i<a.length; i++){
			res[i] = leftProduct[i] * rightProduct[i];
		}
    return res;
  }
}


//method 2 - algoexpert solution 

import java.util.*;

class Program {
  public int[] arrayOfProducts(int[] a) {
    int[] res = new int[a.length];
		int curLeftProduct = 1;
		int curRightProduct = 1;
		int i;
		for(i = 0; i<a.length; i++){
			res[i] = curLeftProduct;
			curLeftProduct *= a[i];
		}
		
		for(i = a.length-1; i>= 0; i--){
			res[i] *= curRightProduct;
			curRightProduct *= a[i];
		}
    return res;
  }
}


