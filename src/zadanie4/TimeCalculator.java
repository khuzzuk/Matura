package zadanie4;

import static java.lang.Math.pow;

public class TimeCalculator {
    public static double timeD1(double n){
        double m = 0.00001*n;
        return pow(m,3)*10+pow(m,2)*7+m*0.1+0.1;
    }
    public static double timeD2(double n){
        return 5*n;
    }
}
