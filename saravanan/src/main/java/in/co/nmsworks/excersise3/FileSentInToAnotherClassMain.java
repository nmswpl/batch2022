package in.co.nmsworks.excersise3;

import java.util.List;

public class FileSentInToAnotherClassMain
{
    public static void main(String[] args)
    {
        List<Integer> listOfInt ;
        String filePath ="/home/nmsadmin/Downloads/Numbers.txt";


        NumbersHandlingInFile objOfNumbersHandling = new NumbersHandlingInFile();
        //=========================text into list of integer==============================================
        listOfInt =objOfNumbersHandling.NumbersInFile(filePath);
        System.out.println(listOfInt.size());



        //================================================duplicate element remove================
        DuplicateElementsInFile obj1OfDuplicateClass = new DuplicateElementsInFile();
        List<Integer> afterRemoveOfDuplicateElement = obj1OfDuplicateClass.duplicateElementRemove(listOfInt);
        System.out.println(afterRemoveOfDuplicateElement.size());
    }
}
