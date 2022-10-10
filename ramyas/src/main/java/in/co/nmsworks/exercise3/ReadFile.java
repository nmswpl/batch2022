package in.co.nmsworks.exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile
{
    public static List<Integer> fileReader(String filepath) throws IOException
    {
        File file = new File(filepath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String values ;
        List<Integer> num = new ArrayList<>();
        while (( values=br.readLine())!= null)
        {
          num.add(Integer.valueOf(values));
        }
        br.close();
        return num;
    }

    public static void main(String[] args) throws IOException
    {
        ReadFile read = new ReadFile();
        List<Integer> no=read.fileReader("/home/nmsadmin/Numbers.txt");
        System.out.println(no);
    }
}
