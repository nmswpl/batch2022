package in.co.nmsworks.excersise3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReading {

    List<Integer> list = new ArrayList<>();

    public List<Integer> readFile(String filePath) throws Exception
    {
        try (FileReader file=new FileReader(filePath);
            BufferedReader br = new BufferedReader(file))
        {
            String s;
            while ((s = br.readLine()) != null) {
                int num = Integer.parseInt(s);
                list.add(num);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}


