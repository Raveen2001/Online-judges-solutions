public class Castle {

    static int count = 0;
    public static void main(String[] args) {
        int step = 5;
        int[][] steps = new int[][]{{1, 1}, {1, 0}, {0, 0}, {0, 0}, {1, 1}};
        findWays(0, step, steps, false);
        System.out.println(count);
        System.out.println(getWays2(steps));
    }

    public static void findWays(int curStep, int destinationStep, int[][] steps, boolean hasSkipped){
        if(curStep == destinationStep){
            count++;
            return;
        }
        if(curStep > destinationStep){
            return;
        }
        boolean doJump = true;
        for(int i = 0; i < steps[curStep].length; i++){
            if(steps[curStep][i] == 1){
                findWays(curStep + 1, destinationStep, steps, false);
                doJump = false;
            }
        }

        if(doJump && !hasSkipped){
            findWays(curStep + 1, destinationStep, steps, true);
        }
    }


    public static int getWays2(int[][] steps){
        int ways = 1;
        boolean hasSkippedPrev = false;
        for(int i = 0; i < steps.length; i++){
            int count = 0;
            for(int j = 0; j < steps[i].length; j++){
                if(steps[i][j] == 1){
                    count++;
                }
            }

            if(count == 0){
                if(hasSkippedPrev) return 0;
                hasSkippedPrev = true;
                continue;
            }

            ways *= count;
            hasSkippedPrev = false;
        }
        return ways;
    }
}
