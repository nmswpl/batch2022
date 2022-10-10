package in.co.nmsworks.exercise3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) throws IOException
    {
        String filepath="/home/nmsadmin/Downloads/Numbers.txt";
        ReadFile readFile=new ReadFile();
        List<Integer> numberList=readFile.readTextFile(filepath);
        System.out.println(numberList);
        System.out.println(numberList.size());

    }


        public List<Integer> readTextFile(String filepath) throws IOException
        {

        List<Integer> numberList=new ArrayList<>();
        String line;

        File file=new File(filepath);
        FileReader fileReader=new FileReader(file);
        BufferedReader br=new BufferedReader(fileReader);
        while ((line=br.readLine())!=null)
        {
//            System.out.println(line);
//            int a=Integer.valueOf(line);
            numberList.add(Integer.valueOf(line));

        }
        return numberList;
        }
}
