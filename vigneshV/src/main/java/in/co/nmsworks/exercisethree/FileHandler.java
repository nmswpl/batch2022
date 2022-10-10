package in.co.nmsworks.exercisethree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler
{
    public static void main(String[] args) throws IOException {
        ReadFile filereader = new ReadFile();
        List<Integer> numbers = new ArrayList<>(filereader.fileParser("/home/nmsadmin/Downloads/Numbers.txt"));
        searchDuplicate(numbers);


    }

    private static void searchDuplicate(List<Integer> numbers)
    {
        ArrayList<Integer> duplicateNum = new ArrayList<>();
        for(int i:numbers)
        {
            if(!duplicateNum.contains(i))
                duplicateNum.add(i);
        }
        System.out.println("DuplicateNumbers "+duplicateNum);
    }
}
