package AlgoExpert;

import java.util.*;
class Program {

  public int firstDuplicateValue(int[] a) {
    int[] tracker = new int[a.length + 1];
		for(int e: a){
			if(tracker[e] == 0) tracker[e] = 1;
			else return e;
		}
    return -1;
  }
}


// method 2 -- optimal space


import java.util.*;

class Program {

  public int firstDuplicateValue(int[] a) {
		for(int e: a){
			e = Math.abs(e);
			if(a[e-1] < 0) return e;
			a[e-1] *= -1;
		}
    return -1;
  }
}


