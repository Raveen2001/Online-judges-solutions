package Hackerrank.ProblemSolving.java;
import java.io.*;
import java.util.*;

public class ElectronicsShop {
    
    
    public static int findMaxSpend(int b, Integer[] k, Integer[] d){
        Arrays.sort(k, Collections.reverseOrder());
        int n = k.length;
        int m = d.length;
        Arrays.sort(d);
        int max = -1;
        for(int i = 0, j = 0; i<n; i++){
            for(; j<m; j++){
                if(k[i] + d[j] > b) break;
                if(k[i] + d[j] > max) max = k[i] + d[j];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Integer k[] = new Integer[n];
        Integer d[] = new Integer[m];
        int i;
        for(i = 0; i<n; i++) k[i] = scanner.nextInt();
        for(i = 0; i<m; i++) d[i] = scanner.nextInt();
        System.out.println(findMaxSpend(b, k, d));
        
    }
}
