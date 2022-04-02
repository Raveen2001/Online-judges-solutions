
import java.util.*;
class PunchingCards{
    public static void main(String[] args) {
        Scanner s=  new Scanner(System.in);
        int t = s.nextInt();
        int count = 0;
        while(count++ != t){
            int r = s.nextInt();
            int c = s.nextInt();
            System.out.println("Case #" + count + ":");
            System.out.println("..+" + "-+".repeat(c-1));
            System.out.println("." + ".|".repeat(c));
            System.out.println("+" + "-+".repeat(c));
            for(int i = 0; i<r-1; i++){
                System.out.println("|" + ".|".repeat(c));
                System.out.println("+" + "-+".repeat(c));
            }
        }
    }
}