package in.co.nmsworks.exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class BufferReader {
    public static List<Integer> Readfile(String filepath) throws Exception
    {
        File file = new File(filepath);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String str;
        List<Integer> numlist = new ArrayList<>();

        while (((str = br.readLine()) != null)) {
            Integer num = Integer.valueOf(str);
            numlist.add(num);
        }
        return numlist;
    }
}








