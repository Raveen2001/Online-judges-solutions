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


