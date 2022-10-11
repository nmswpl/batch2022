package in.co.nmsworks.excersice3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindOccurence {

    public static void main(String[] args) throws IOException {

        ReadingFileExercise3 r=new ReadingFileExercise3();
        List<Integer> result= r.readingFiles("/home/nmsadmin/Downloads/Numbers.txt");

        int temp;
        //int count=0;
        List<Integer> dup=new ArrayList<>();

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




        }
        catch (Exception e)
        {
            e.printStackTrace();
        }



        System.out.println(occurenceOfElement);


    }


}
