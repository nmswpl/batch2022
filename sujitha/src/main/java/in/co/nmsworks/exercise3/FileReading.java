package in.co.nmsworks.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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

    public Map<Integer,Integer> countOccurrenceOfElement(List<Integer> result) {
        Map<Integer, Integer> numberWithCount = new HashMap<>();
        for (int i = 0; i < result.size(); i++)
        {
            if (numberWithCount.containsKey(result.get(i)))
            {
                int values = numberWithCount.get(result.get(i));

                numberWithCount.put(result.get(i), values + 1);
            }
            else
            {
                numberWithCount.put(result.get(i), 1);
            }
        }
        System.out.println(numberWithCount);
        System.out.println(numberWithCount.size());
        return numberWithCount;
    }

    public void countAgainstNumbers(Map<Integer,Integer> map1)
    {
       Map<Integer,List<Integer>> countWithNumbers=new HashMap<>();

      for (Integer keys :map1.keySet())
      {
          if (countWithNumbers.containsKey(map1.get(keys)))
          {
              List<Integer> n = countWithNumbers.get(map1.get(keys));
              n.add(keys);
              countWithNumbers.put(map1.get(keys),n);
          }

          else
          {
              List<Integer> values = new ArrayList<>();
              values.add(keys);
              countWithNumbers.put(map1.get(keys),values);
          }
      }
        System.out.println(countWithNumbers);
        System.out.println(countWithNumbers.size());
        System.out.println(countWithNumbers.get(1));
        System.out.println(countWithNumbers.get(2));
        System.out.println(countWithNumbers.get(3));
        System.out.println(countWithNumbers.get(4));
    }

    public static void main(String[] args) throws IOException {
        FileReading fr = new FileReading();
        List<Integer> result = fr.readFile("/home/nmsadmin/Downloads/Numbers.txt");
        //System.out.println(result);
        Map<Integer,Integer> count=fr.countOccurrenceOfElement(result);
        fr.countAgainstNumbers(count);

    }
}
