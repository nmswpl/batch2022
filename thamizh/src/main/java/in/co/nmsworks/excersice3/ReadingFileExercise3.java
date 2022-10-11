package in.co.nmsworks.excersice3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadingFileExercise3 {

    public static List<Integer> readingFiles(String filedes) throws IOException {

        List<Integer> val=new ArrayList<>();

        File file = new File(filedes);

        try (

              FileReader fr = new FileReader(filedes);
              BufferedReader br = new BufferedReader(fr))

        {




            String s;
            while ((s=br.readLine()) != null)
            {
               // s= br.readLine();
                val.add(Integer.valueOf(s));


            }

            //System.out.println(val.size());
        }

        return val;
    }

//    public static void main(String[] args) throws IOException {
//        ReadingFileExercise3 r=new ReadingFileExercise3();
//        r.readingFiles("/home/nmsadmin/Downloads/Numbers.txt");
//    }

}
