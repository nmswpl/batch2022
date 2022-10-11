package in.co.nmsworks.excersice3;



import java.util.*;

public class NumberOfDuplicate {
    public  Map<Integer, Integer> count(List<Integer> numberList){
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer value : numberList) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else
                map.put(value, 1);
        }
        System.out.println(map);
        return map;
    }
    public static void main(String[] args) throws Exception {
        FileCreation path = new FileCreation();
        NumberOfDuplicate n1=new NumberOfDuplicate();
        //int count=0;
//        path.fileRead("/home/nmsadmin/Downloads/Numbers.txt");
        List<Integer> numberList = path.fileRead("/home/nmsadmin/Downloads/Numbers.txt");
        n1.count(numberList);


    }
}
