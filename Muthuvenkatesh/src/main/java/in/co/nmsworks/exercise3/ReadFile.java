package in.co.nmsworks.exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class ReadFile {
    public  static List<Integer> fileRead(String filePath) throws Exception{
        ArrayList <Integer> list = new ArrayList<>();
        File file = new File(filePath);
        FileReader read = new FileReader(file);
        BufferedReader buffer = new BufferedReader(read);
        String line;
        while ((line = buffer.readLine())!=null){
            list.add(Integer.parseInt(line));
        }
        read.close();
        return list;
    }
}
