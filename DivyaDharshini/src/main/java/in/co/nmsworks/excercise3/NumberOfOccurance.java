package in.co.nmsworks.excercise3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfOccurance {
    public int numberOfOccurance(List<Integer> original)
    {
        Map<Integer,Integer> integerMap=new HashMap<>();
        for (int i : original) {
            int count = 0;
            for (int j : original) {
                if (i == j) {
                    count++;
                }
            }
            integerMap.put(i, count);
        }
        System.out.println("\nCount : "+integerMap);
        return integerMap.size();
    }
    public static void main(String[] args) throws Exception {
        CreateFile createFile =new CreateFile();
        String filePath="/home/nmsadmin/Downloads/Numbers.txt";
        List<Integer> a= createFile.readFile(filePath);
        System.out.println(a);

        NumberOfOccurance number=new NumberOfOccurance();
        System.out.println(number.numberOfOccurance(a));
    }
}
