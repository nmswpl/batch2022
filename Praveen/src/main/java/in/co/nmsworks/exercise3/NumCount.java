package in.co.nmsworks.exercise3;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumCount {
    public static void main(String[] args) throws IOException {
        String filepath = "/home/nmsadmin/Downloads/Numbers.txt";
        ReadFile r = new ReadFile();
        List<Integer> numberList = r.readTextFile(filepath);
        new NumCount().printCount(numberList);
    }

    public  Map<Integer, Integer>  printCount(List<Integer> numberList) {
        Map<Integer, Integer> countNum = new HashMap<>();
        for (int i = 0; i < numberList.size(); i++) {
            int num = numberList.get(i);

             if (countNum.containsKey(num)) {
                int count=countNum.get(num);
                count++;
             countNum.put(num,count);
            } else {

                countNum.put(num,1);
            }

        }
//        System.out.println(countNum);
//        System.out.println(countNum.size());

        return countNum;
    }
    }

