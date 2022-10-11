package in.co.nmsworks.excersise3;

import java.util.List;
import java.util.Map;

public class FileSentInToAnotherClassMain
{
    public static void main(String[] args)
    {
        List<Integer> listOfInt ;
        String filePath ="/home/nmsadmin/Downloads/Numbers.txt";


        NumbersHandlingInFile objOfNumbersHandling = new NumbersHandlingInFile();
        //=========================text into list of integer==============================================
        listOfInt =objOfNumbersHandling.NumbersInFile(filePath);
        System.out.println("size of array "+listOfInt.size());



        //================================================duplicate element remove================
        DuplicateElementsInFile obj1OfDuplicateClass = new DuplicateElementsInFile();
        List<Integer> afterRemoveOfDuplicateElement = obj1OfDuplicateClass.duplicateElementRemove(listOfInt);
        System.out.println("size of unique array "+afterRemoveOfDuplicateElement.size());

        //==============================================duplicate count======================
        CountOfEachDuplicateElement objOfDuplicateCount = new CountOfEachDuplicateElement();
        Map<Integer,List<Integer>> duplicateValuesCount = objOfDuplicateCount.countOfEachDuplicate(listOfInt);
       // System.out.println(duplicateValuesCount.size());
        System.out.println("size of map"+duplicateValuesCount.size());

        for (Integer temp : duplicateValuesCount.keySet())
        {
            System.out.println(temp+"  "+duplicateValuesCount.get(temp));
        }
    }
}
