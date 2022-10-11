package in.co.nmsworks.exercise3;

import java.io.IOException;
import java.util.*;

import static in.co.nmsworks.exercise3.FileParse.readTheFile;

public class FindingDuplicates {
    public static void main(String[] args){

        try {
            List<Integer>intList=readTheFile("/home/nmsadmin/Downloads/Numbers.txt");
            System.out.println(intList);
            Set<Integer>duplicates=new HashSet<>();
            int count = 0;
            for (int num:intList)
            {
                if (duplicates.contains(num))
                {
                    System.out.println("duplicates "+num);
                    count++;

                }
                else
                {
                    duplicates.add(num);
                }
            }
            System.out.println("duplicate values are"+count);


            Map<Integer,Integer>OccuranceOfNumber=new HashMap<>();
           for(int i:intList){
               if(OccuranceOfNumber.containsKey(i)){
                   OccuranceOfNumber.put(i,OccuranceOfNumber.get(i)+1);

               }
               else{
                   OccuranceOfNumber.put(i,1);
               }

           }
            System.out.println(OccuranceOfNumber);



        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
