package in.co.nmsworks.excercise3;

import java.util.*;

public class FileMain {
    public static  void main(String[] args) throws Exception {
        String filePath = "/home/nmsadmin/Downloads/Numbers.txt";
        FileRead fileRead = new FileRead();

        System.out.println("---------------------------------------------------------------------------------------------------");

        List<Integer> originalIntegerList = new ArrayList<>(fileRead.readFileAsInt(filePath));
        System.out.println(" Original List : "+originalIntegerList);


        List<Integer> duplicateIntegerList = FileDuplicateElement.findDuplicate(originalIntegerList);
        System.out.println(" Duplicate Integer value List : "+duplicateIntegerList);


        Map<Integer,Integer> duplicateValueCountMap = FileDuplicateOccurrence.occurrence(originalIntegerList,duplicateIntegerList);
        System.out.println(" Count of Duplicate Integers in Map{Integer,Count} : " + duplicateValueCountMap);

        System.out.println("---------------------------------------------------------------------------------------------------");










    }
}
