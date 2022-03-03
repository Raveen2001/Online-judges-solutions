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



// method 2 -- more readable

import java.util.*;

class Program {
  public static int longestPeak(int[] a) {
    int maxPeakLength = 0;
		int i = 1;
		while(i<a.length-1){
			boolean isPeak = (a[i-1] < a[i]) && (a[i] > a[i+1]);
			if(!isPeak){
				i+=1;
				continue;
			}
			System.out.println("Peak: " + a[i]);
			int leftIdx = i - 2;
			while(leftIdx >= 0 && a[leftIdx] < a[leftIdx + 1]){
				leftIdx -= 1;
			}
			System.out.println("left: " + leftIdx);
			int rightIdx = i + 2;
			while(rightIdx < a.length && a[rightIdx] < a[rightIdx - 1]){
				rightIdx += 1;
			}
			System.out.println("right: " + rightIdx);
			int currentPeakLength = rightIdx - leftIdx - 1;
			System.out.println(currentPeakLength);
			maxPeakLength = Math.max(currentPeakLength, maxPeakLength);
			i = rightIdx-1;
		}
    return maxPeakLength;
  }
}
