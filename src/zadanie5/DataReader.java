package zadanie5;

import java.io.*;

public class DataReader {
    static int[] parseSequenceFromFile(String fileName){
        String text = readFile(fileName);
        int[] numbers = parseNumbers(text);
        return numbers;
    }

    static private String readFile(String fileName) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName))))) {
            String line;
            while ((line = reader.readLine())!=null){
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    static private int[] parseNumbers(String text) {
        String[] numbersInText = text.split(",");
        int[] numbers = new int[numbersInText.length];
        for (int i = 0; i < numbersInText.length; i++) {
            numbers[i] = Integer.parseInt(numbersInText[i]);
        }
        return numbers;
    }
}
