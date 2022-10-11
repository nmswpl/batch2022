package in.co.nmsworks.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileReading {
    public static List<Integer> readFile(String path) throws IOException {
        List<Integer> listOfNumbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String numbers;
            while ((numbers = br.readLine()) != null) {
                int numbers1 = Integer.parseInt(numbers);
                listOfNumbers.add(numbers1);
            }
        }
        return listOfNumbers;
    }

    public void countOccurrenceOfElement(List<Integer> result) {
        Map<Integer, Integer> numberWithCount = new HashMap<>();
        for (int i = 0; i < result.size(); i++) {
            if (numberWithCount.containsKey(result.get(i))) {
                int values = numberWithCount.get(result.get(i));

                numberWithCount.put(result.get(i), values + 1);
            } else {
                numberWithCount.put(result.get(i), 1);
            }
        }
        System.out.println(numberWithCount);
        System.out.println(numberWithCount.size());
    }

    public static void main(String[] args) throws IOException {
        FileReading fr = new FileReading();
        List<Integer> result = fr.readFile("/home/nmsadmin/Downloads/Numbers.txt");
        //System.out.println(result);
        fr.countOccurrenceOfElement(result);
    }
}
