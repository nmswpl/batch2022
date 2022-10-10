package in.co.nmsworks.excersice3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {

    public static void main(String[] args) throws IOException {

        ReadingFileExercise3 r=new ReadingFileExercise3();
        List<Integer> result= r.readingFiles("/home/nmsadmin/Downloads/Numbers.txt");

        int temp;
        int count=0;
        List<Integer> dup=new ArrayList<>();

        for(int i=0;i<result.size();i++)
        {
            temp= result.get(i);
            if(dup.contains(temp))
                count++;
            else
            {
                dup.add(temp);
            }

        }

        System.out.println(count);


    }


}
