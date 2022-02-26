package AlgoExpert;

import java.util.*;

class Program {

  public int minimumWaitingTime(int[] queries) {
		int minWaitTime = 0;
    Arrays.sort(queries);
		for(int i = 0; i<queries.length-1; i++){
			minWaitTime += queries[i] * (queries.length - i - 1);
		}
    return minWaitTime;
  }
}
