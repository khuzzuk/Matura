package zadanie5;

public class SumCalculator {
    static int getTheHighestSum(int[] sequence){
        int max=0, loopSum;
        for (int a=0; a<sequence.length; a++){
            loopSum=0;
            for (int b=a; b<sequence.length; b++){
                if (sequence[b]>max) max=sequence[b];
                loopSum+=sequence[b];
                if (loopSum>max) max=loopSum;
            }
        }
        return max;
    }
}
