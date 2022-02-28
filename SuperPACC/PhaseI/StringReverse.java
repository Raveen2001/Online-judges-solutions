package SuperPACC.PhaseI;
import java.util.*;
public class StringReverse {
    public static void main(String[] args){
        String s = "a,b#c";
        char[] res = s.toCharArray();
        char temp;
        int left = 0;
        int right = s.length() - 1;
        while(left<right){
            if(Character.isLetter(res[left]) && Character.isLetter(res[right])){
                temp = res[left];
                res[left] = res[right];
                res[right] = temp;
                left ++;
                right --;
            }else if(!Character.isLetter(res[left])){
                left++;
            }else{
                right--;
            }
        }
        System.out.print("[");
        for(int i = 0; i<res.length; i++){
            System.out.print("'" + res[i] + "'");
            if(i+1<res.length){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
