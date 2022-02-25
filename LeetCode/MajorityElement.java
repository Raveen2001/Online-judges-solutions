package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int maj = majorityElement(new int[]{1,1, 2, 2, 3, 3, 3, 3, 3});
        System.out.println(maj);
    }


    public static int majorityElement(int[] nums){
        Map<Integer, Integer> hash = new HashMap<>();
        for(int num : nums){
            if(hash.containsKey(num)){
                hash.put(num, hash.get(num) + 1);
                
            }else{
                hash.put(num, 1);
            }
            if(hash.get(num) > nums.length/2) return num;
        }
        return -1;
    }
}
