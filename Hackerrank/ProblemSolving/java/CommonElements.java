package Hackerrank.ProblemSolving.java;
import java.util.*;
public class CommonElements {
    public static void main(String[] args) {
        System.out.println(getCommonElements(Arrays.asList(2, 3, 100, 7, 5), Arrays.asList(7, 100, 1, 8)));
    }


    public static List<Integer> getCommonElements(List<Integer> list1, List<Integer> list2){
        List<Integer> res = new ArrayList<Integer>();
        Collections.sort(list1);
        Collections.sort(list2);
        int pointer1 = 0, pointer2 = 0;
        int len1 = list1.size(), len2 = list2.size();
        while(pointer1 < len1 && pointer2 < len2){
            int num1 = list1.get(pointer1);
            int num2 = list2.get(pointer2);
            if(num1 == num2) {
                res.add(num1);
                pointer1 ++;
                pointer2 ++;
            }else if(num1 < num2){
                pointer1 ++;
            }else{
                pointer2 ++;
            }
        }
        return res;
    }
}
