package in.co.nmsworks.exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTheFile
{
        public  static List<Integer> readTheFileUsingBuffer(String filePath) throws Exception
        {
            List<Integer> arr=new ArrayList<>();
            try( BufferedReader reader = new BufferedReader(new FileReader(filePath)))
            {

                String txt;
                while ((txt = reader.readLine()) != null)
                {
                    arr.add(Integer.parseInt(txt));

                }

            }
            catch(Exception e)
            {
                System.out.println("File is not found");
            }
            return arr;
        }
    }

