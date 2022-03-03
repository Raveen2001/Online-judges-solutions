package AlgoExpert;

import java.util.*;

class Program {

  public int[][] mergeOverlappingIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		
		List<int[]> mergedIntervals = new ArrayList<>();
		int[] currentInterval = intervals[0];
		for(int[] nextInterval: intervals){
			int currentIntervalEnd = currentInterval[1];
			int nextIntervalStart = nextInterval[0];
			int nextIntervalEnd = nextInterval[1];
			
			if(currentIntervalEnd >= nextIntervalStart){
				currentInterval[1] = Math.max(currentIntervalEnd, nextIntervalEnd);
			}else{
				mergedIntervals.add(currentInterval);
				currentInterval = nextInterval;
			}
		}
		mergedIntervals.add(currentInterval);
		
    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
  }
}
