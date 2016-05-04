package zadanie4;

import java.io.*;

public class CalculationB {
    public static void main(String[] args) {
        calculate();
    }

    private static void calculate() {
        StringBuilder sb = new StringBuilder();
        sb.append("GB;LicD1;LicD2;KosztD2;KosztD2\n");
        for (int i=6000; i<=9000; i+=100){
            writeLine(sb, i);
        }
        writeCalculations(sb);
    }

    private static void writeLine(StringBuilder sb, int i) {
        sb.append(i);
        sb.append(";");
        sb.append(CostCalculator.costD1(i));
        sb.append(";");
        sb.append(CostCalculator.costD2(i));
        sb.append(";");
        sb.append(TimeCalculator.timeD1(i));
        sb.append(";");
        sb.append(TimeCalculator.timeD2(i));
        sb.append("\n");
    }

    private static void writeCalculations(StringBuilder sb) {
        System.out.println(sb);
        File file = new File("wyniki.csv");
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));) {
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
