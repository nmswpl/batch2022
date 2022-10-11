package in.co.nmsworks.exercise3;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumbersCount
{
    public static HashMap<Integer, Integer> NoOfCount(List<Integer> inputlist) {
        HashMap<Integer, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < inputlist.size(); i++) {
        int number = inputlist.get(i);

        if(!resultMap.containsKey(number)){
            resultMap.put(number,1);
        }
        else{
           Integer value = resultMap.get(number);
           value++;
           resultMap.put(number,value);
        }

        }
        return resultMap;
    }

    public static void main(String[] args)throws IOException {
        List<Integer> inputlist = FileParsing.readFileUsingBufferedReader("/home/nmsadmin/git/batch2022/thilagavathi/src/main/java/in/co/nmsworks/exercise3/Numbers.txt");
        HashMap<Integer,Integer> outputlist = NoOfCount(inputlist);
        NoOfCount(inputlist);
        System.out.println(outputlist);
    }


    }


