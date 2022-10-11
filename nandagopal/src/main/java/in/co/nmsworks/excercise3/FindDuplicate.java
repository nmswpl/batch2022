package in.co.nmsworks.excercise3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// find duplicate from the file
public class FindDuplicate {
    public static List<Integer> findDuplicated(List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicateNumbers = new ArrayList<>();

        for(Integer number : numbers) {
            if(seen.contains(number)) {
                duplicateNumbers.add(number);
                continue;
            }
            seen.add(number);
        }

        return duplicateNumbers;
    }
    public static void main(String[] args) {
        String filePath = "/home/nmsadmin/Desktop/Training/assetFiles/Numbers.txt";
        List<Integer> numbers;

        try {
            numbers = ReadContent.readFile(filePath);
        }
        catch (Exception e) {
            System.out.println("File cannot be read");
            return;
        }

        List<Integer> duplicateNumbers = findDuplicated(numbers);
        System.out.println("Duplicate contents : " + duplicateNumbers);
    }
}
