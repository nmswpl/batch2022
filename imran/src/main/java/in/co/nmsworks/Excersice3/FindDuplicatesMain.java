package in.co.nmsworks.Excersice3;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import static in.co.nmsworks.Excersice3.FindDuplicatesInAFile.findDuplicates;
import static in.co.nmsworks.Excersice3.ReadFile.readfile;
import static in.co.nmsworks.Excersice3.NumberOfOccurance.numberOfOccurance;
public class FindDuplicatesMain
{
    public static void main(String[] args) throws IOException {
        List<Integer> readedFileList = readfile("/home/nmsadmin/Downloads/Numbers.txt");
        Set<Integer> duplicateValueList = findDuplicates(readedFileList);
        System.out.println("Original List : "+readedFileList);
        System.out.println("\n");
        System.out.println("DuplicateList : "+duplicateValueList);
        numberOfOccurance(readedFileList);

    }
}
