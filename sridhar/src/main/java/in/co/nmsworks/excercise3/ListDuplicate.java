package in.co.nmsworks.excercise3;

import java.util.*;

public class ListDuplicate {
    public static void main(String[] args) {
        List<Integer> numbersList = FileReader.readFileAndParseAsNumbers("/home/nmsadmin/Downloads/Numbers.txt");
        ListDuplicate rd = new ListDuplicate();
        List<Integer> result = rd.findDuplicate(numbersList);
        System.out.println("Duplicates "+result.size());
        System.out.println("Duplicates "+result);
    }
    public List<Integer> findDuplicate(List<Integer> numberList) {
        Set<Integer> duplicateSet=new HashSet<>();
        List<Integer> duplicateList=new ArrayList<>();
        for (Integer num : numberList)
        {
            if(duplicateSet.contains(num))
            {
                duplicateList.add(num);
            }
            else
            {
                duplicateSet.add(num);
            }
        }
        return duplicateList;
    }

}
