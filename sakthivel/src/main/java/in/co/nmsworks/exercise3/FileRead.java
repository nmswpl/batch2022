package in.co.nmsworks.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileRead
{
    public  static  List<Integer> fileRead(String filePath) throws Exception
    {
        // Reading

         List<Integer> list = new ArrayList<>();
        try ( FileReader file  = new FileReader(filePath);
            BufferedReader br = new BufferedReader(file))
        {
            String str;
            while (((str = br.readLine()) != null))
            {

                list.add(Integer.parseInt(str));
            }

        }

        return list;
    }

}
