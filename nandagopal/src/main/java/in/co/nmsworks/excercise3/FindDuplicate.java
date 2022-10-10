package in.co.nmsworks.excercise3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// find duplicate from the file
public class FindDuplicate {
    public static void main(String[] args) {
        String filePath = "/home/nmsadmin/Desktop/Training/assetFiles/Numbers.txt";
        List<Integer> fileContents = ReadContent.readFile(filePath);

        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicateFileContents = new ArrayList<>();

        for(Integer number : fileContents) {
            if(seen.contains(number)) {
                duplicateFileContents.add(number);
                continue;
            }
            seen.add(number);
        }

        System.out.println("Duplicate contents : " + duplicateFileContents);
    }
}
