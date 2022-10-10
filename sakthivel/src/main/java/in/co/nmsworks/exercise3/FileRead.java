package in.co.nmsworks.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileRead
{
    public  static List<Integer> fileRead(String filePath) throws Exception
    {
        // Reading
        FileReader file=new FileReader(filePath);
        BufferedReader br=new BufferedReader(file);

        List<Integer> list = new ArrayList<>();

        String str ;
        while (((str = br.readLine()) != null))
        {

            list.add(Integer.parseInt(str));
        }
       //System.out.println(list);
        br.close();
        return list;

    }

}
