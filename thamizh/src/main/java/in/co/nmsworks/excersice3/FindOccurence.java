package in.co.nmsworks.excersice3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindOccurence {

    public static void main(String[] args) throws IOException {
        List<Integer> result= ReadingFileExercise3.readingFiles("/home/nmsadmin/Downloads/Numbers.txt");

        Map<Integer, Integer> occurenceOfElement=new HashMap<>();



        try {

            for (int i = 0; i < result.size(); i++)
            {
                // temp= result.get(i);
                int element = result.get(i);

                if (occurenceOfElement.containsKey(element)) {

                    int count=occurenceOfElement.get(element);
                    count++;
                    occurenceOfElement.put(element,count);

                }

                else {
                    occurenceOfElement.put(element, 1);

                }


            }

/// finding each time occurence ....

            Map<Integer, List<Integer>> eachtime=new HashMap<>();

            for(Integer keys: occurenceOfElement.keySet())
            {


                Integer valOfMap= occurenceOfElement.get(keys);

                if(eachtime.containsKey(valOfMap))
                {
                    eachtime.get(valOfMap).add(keys);


                }

                else
                {
                    List<Integer> lis=new ArrayList<>();
                    lis.add(keys);
                    eachtime.put(valOfMap,lis);
                }

            }
            System.out.print(eachtime);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }



      //  System.out.println(occurenceOfElement);

        //System.out.println(eachtime.size());


    }


}
