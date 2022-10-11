package in.co.nmsworks.excercise3;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NumberOccurrenceComputer {

    public static HashMap<Integer, Integer> countOfNumbers(List<Integer> numberList) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for(int i=0; i<numberList.size();i++){
            System.out.println(numberList.get(i));
           int number = numberList.get(i);
           if(!result.containsKey(number)){
               result.put(number,1);
           }
           else {
               Integer value = result.get(number);
               value++;
               result.put(number, value);
           }
        }
        return result;
    }
    public static void main(String[] args) {

        List<Integer> intputList = FileParsing.readFileAndGetIntList("/home/nmsadmin/Downloads/Numbers.txt");
        HashMap<Integer,Integer> outputList = countOfNumbers(intputList);
        System.out.println(outputList);
    }
}
