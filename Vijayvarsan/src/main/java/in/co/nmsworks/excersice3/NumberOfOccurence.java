package in.co.nmsworks.excersice3;

import java.util.*;

public class NumberOfOccurence {
    public static void main(String[] args) throws Exception {

//        Map<Integer, List<Integer>> numberCountValues =new HashMap<>();
//        List<Integer> l1=new ArrayList<>();
//        for (int val : map.keySet()) {
//            // System.out.println(map.get(val) + ":" + val);
//            if (numberCountValues.containsKey(map.get(val)))
//            {
//                numberCountValues.put(map.get(val),l1);
//            }
//            else
//                numberCountValues.put(map.get(val), Arrays.asList(val));
//
//        }
//        System.out.println(numberCountValues);

//        for (int i = 0; i < map.size(); i++) {
//             System.out.println(map.get(i));
//        }
        FileCreation path = new FileCreation();
        List<Integer> numberList = path.fileRead("/home/nmsadmin/Downloads/Numbers.txt");

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer value : numberList) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else
                map.put(value, 1);
        }
//        System.out.println(map);

        Map<Integer,List<Integer>> occMap=new HashMap<>();
        for (int val1 : map.keySet())
        {

            if (occMap.containsKey(map.get(val1)))
            {

                occMap.get(map.get(val1)).add(val1); //nu =  occ.get(1)
//                List<Integer> num = occMap.get(map.get(val1));
//                occMap.put(map.get(val1),num);
            }
            else

            {
                List<Integer> num =new ArrayList<>();
                num.add(val1);
                occMap.put(map.get(val1),num);
            }
//                occMap.put(map.get(val1),new ArrayList<>()); // 2,[]
//                occMap.get(map.get(val1)).add(val1);                 //
//            System.out.println(map.get(val1));
        }
        System.out.println(occMap);
    }
}
