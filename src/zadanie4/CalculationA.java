package zadanie4;

public class CalculationA {
    public static void calculateRange(){
        int d1Min = 0, d1Max = 0, d2Min = 0, d2Max = 0;
        double d1Cost, d2Cost;
        for (int i = 1; i <= 7000; i++) {
            d1Cost = CostCalculator.costD1(i)+TimeCalculator.timeD1(i);
            d2Cost = CostCalculator.costD2(i)+TimeCalculator.timeD2(i);
            if (d1Cost<d2Cost){
                d1Max=i;
                if (d1Min==0) d1Min=i;
            }
            else {
                d2Max=i;
                if (d2Min==0) d2Min=i;
            }
        }
        System.out.println(d1Min);
        System.out.println(d1Max);
        System.out.println(d2Min);
        System.out.println(d2Max);
    }

    private static void showCost(double n){
        System.out.println("Koszt obliczeń firmy D1 dla "+n+" GB:");
        System.out.println(CostCalculator.costD1(n)+TimeCalculator.timeD1(n));
        System.out.println("Koszt obliczeń firmy D2 dla "+n+" GB:");
        System.out.println(CostCalculator.costD2(n)+TimeCalculator.timeD2(n));
    }

    public static void main(String[] args) {
        calculateRange();
        showCost(100);
        showCost(1000);
        showCost(5000);
    }
}
