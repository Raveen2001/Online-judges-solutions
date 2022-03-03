package AlgoExpert;

import java.util.*;

class Program {
  public static int longestPeak(int[] a) {
		if(a.length < 3) return 0;
    int maxPeak = 0;
		int tempPeak = 1;
		boolean isIncreasing = true;
		for(int i = 1; i<a.length; i++){
			if(a[i-1] == a[i]){
				if(!isIncreasing) maxPeak = Math.max(tempPeak, maxPeak);
				tempPeak = 0;
				isIncreasing = true;
			}
			else if(isIncreasing){
				if(a[i-1] > a[i]){
					if(tempPeak < 2) tempPeak = 0;
					else isIncreasing = false;
				}
			}else{
				System.out.println(tempPeak);
				if(a[i-1] < a[i]){
					isIncreasing = true;
					maxPeak = Math.max(tempPeak, maxPeak);
					System.out.println(" --> " + maxPeak);
					tempPeak = 1;
				}
			}
			tempPeak ++;
		}
		if(!isIncreasing)maxPeak = Math.max(tempPeak, maxPeak);
    return maxPeak;
  }
}
