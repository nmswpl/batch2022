package in.co.nmsworks.excercise3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileRead {

    public List<Integer> readFileAsInt(String filePath) throws Exception
    {

        List<Integer> integerList = new ArrayList<>();


        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String i;

            while ((i = (br.readLine())) != null)
            {
                integerList.add(Integer.parseInt(i));

            }
            return integerList;
    }


}

