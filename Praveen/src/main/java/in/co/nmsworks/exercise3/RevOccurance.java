package in.co.nmsworks.exercise3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RevOccurance {
    public static void main(String[] args) throws IOException {
        String filepath = "/home/nmsadmin/Downloads/Numbers.txt";
        ReadFile r = new ReadFile();
        NumCount n = new NumCount();
        List<Integer> numberList = r.readTextFile(filepath);
        Map<Integer, Integer> countNum = n.printCount(numberList);
        printOccurance(countNum);
    }

    public static void printOccurance(Map<Integer, Integer> countNum) {
//        countNum = new HashMap<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int num : countNum.keySet())   // 774 =1 , 66 = 2, 88 = 1
        {
            int count = countNum.get(num);
            if (map.containsKey(count))
            {
                map.get(count).add(num);
            } else {

                List<Integer> l1 = new ArrayList<>();
                l1.add(num);
                map.put(count, l1);

//            }
//
////        }
//            System.out.println(rev);
//
//
//     }

            }

        }
        System.out.println(map);
    }
}