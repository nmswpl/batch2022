package in.co.nmsworks.excersise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class NumbersHandlingInFile
{
    public List<Integer> NumbersInFile(String fileAddress)
    {
        List<Integer> listArray =new ArrayList<>();

        try (BufferedReader read = new BufferedReader(new FileReader(fileAddress)))
        {

            String str;
            int temp;
            while ((str = read.readLine()) != null)
            {
                 temp = Integer.parseInt(str);
                 listArray.add(temp);

            }
            return listArray;

        }
        catch(Exception e)
            {
                System.out.println("cannot  added in list ");
            }
        return listArray;
    }
}
