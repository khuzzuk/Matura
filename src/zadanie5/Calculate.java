package zadanie5;

public class Calculate {
    public static void main(String[] args) {
        int[] numbers = DataReader.parseSequenceFromFile("dane5-1.txt");
        System.out.println("Najpopularniejszy numer to: "+NumberPicker.getMostPopular(numbers));
        System.out.println("Największa suma to: "+SumCalculator.getTheHighestSum(numbers));
    }
}
