package in.co.nmsworks.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {


    public static void main(String[] args) throws IOException
    {
        String filepath="/home/nmsadmin/Downloads/Numbers.txt";
        ReadFile readFile=new ReadFile();
        List<Integer> numberList=readFile.readTextFile(filepath);
        new Duplicate().printDuplicate(numberList);
    }

    public void printDuplicate(List<Integer> numberList)
    {
        Set<Integer> duplicate=new HashSet<>();
        int count=0;
        for (int i = 0; i <numberList.size(); i++)
        {
            if(duplicate.contains(numberList.get(i)))
            {
                count++;
                System.out.println(numberList.get(i)+" is duplicate");
            }
            else
            {
                duplicate.add(numberList.get(i));
            }
        }
        System.out.println(count);


    }

}

