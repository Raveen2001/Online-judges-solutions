package ProblemSolving.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {

    public static void main(String[] args){
        List<Integer> scores = Arrays.asList(new Integer[]{10, 5, 20, 20, 4, 5, 2, 25, 1}); 
        List<Integer> res = new ArrayList<>();
        int low = scores.get(0), high = scores.get(0), lRecordBreak = 0, rRecordBreak = 0;
        for(int a: scores){
            if(a<low){
                lRecordBreak ++;
                low = a;
            }
            if(a>high){
                rRecordBreak ++;
                high = a;
            }
        }
        res.add(rRecordBreak);
        res.add(lRecordBreak);
        System.out.println(res.toString());
        
    }
    
}
