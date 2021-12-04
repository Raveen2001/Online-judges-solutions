package ProblemSolving.java;

import java.util.Arrays;
import java.util.List;

public class MagicSquare {
    public static void main(String[] args) {
        int x, y, minCost = 0, temp1, temp2, k;
        boolean flag1 = false, flag2 = false;
        List<Integer> magicSquare = Arrays.asList(4, 9, 2, 3, 5, 7, 8, 1, 5);
        if (magicSquare.get(4) != 5) {
            minCost += Math.abs(5 - magicSquare.get(4));
            magicSquare.set(4, 5);
        }
        temp1 = magicSquare.get(0);
        temp2 = magicSquare.get(8);
        if (isCornerElement1(temp1) || isCornerElement2(temp1)) {
            minCost += Math.abs(10 - temp1 - temp2);
            magicSquare.set(8, 10 - temp1);
        } else if (isCornerElement1(temp2) || isCornerElement2(temp2)) {
            minCost += Math.abs(10 - temp2 - temp1);
            magicSquare.set(0, 10 - temp2);
        } else {
            flag1 = true;
        }
        temp1 = magicSquare.get(2);
        temp2 = magicSquare.get(6);
        if (isCornerElement1(temp1) || isCornerElement2(temp1)) {
            minCost += Math.abs(10 - temp1 - temp2);
            magicSquare.set(6, 10 - temp1);
        } else if (isCornerElement1(temp2) || isCornerElement2(temp2)) {
            minCost += Math.abs(10 - temp2 - temp1);
            magicSquare.set(2, 10 - temp2);
        } else {
            flag2 = true;
        }

        k = 15 - (magicSquare.get(0) + magicSquare.get(2));
        // System.out.println(k + " " + magicSquare.get(0) + " " + magicSquare.get(2));
        minCost += Math.abs(magicSquare.get(1) - k);
        magicSquare.set(1, k);
        k = 10 - k;
        minCost += Math.abs(magicSquare.get(7) - k);
        magicSquare.set(7, k);

        k = 15 - (magicSquare.get(0) + magicSquare.get(6));
        minCost += Math.abs(magicSquare.get(3) - k);
        magicSquare.set(3, k);
        k = 10 - k;
        minCost += Math.abs(magicSquare.get(5) - k);
        magicSquare.set(5, k);
        // System.out.println(magicSquare.toString());
        System.out.println(minCost);

    }

    public static boolean isCornerElement1(int a) {
        return (a == 4 || a == 6);
    }

    public static boolean isCornerElement2(int a) {
        return (a == 8 || a == 2);
    }
}