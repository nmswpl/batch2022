package in.co.nmsworks.exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadFile {

    public void fetchData(String path)
    {
        File file = new File(path);
        ArrayList<Integer> arrayList = new ArrayList<>();
        try
        {
            FileReader fileReader= new FileReader(file);
            BufferedReader bf = new BufferedReader(fileReader);
            String line;
            int count=0;
            int duplicate=0;
            while ((line = bf.readLine()) != null)
            {
                int value = Integer.parseInt(line);
                if (!arrayList.contains(value))
                {
                    count++;
                    arrayList.add(value);
                }
                else {
                    System.out.println("It's already present: "+value);
                    duplicate++;
                }
            }
            System.out.println(count);
            System.out.println(duplicate);
            fileReader.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public ArrayList<String> getData(String path)
    {
        File file = new File(path);
        ArrayList<String> arrayList = new ArrayList<>();

        try
        {
            FileReader fileReader = new FileReader(path);
            BufferedReader bf = new BufferedReader(fileReader);

            String line;
            while((line = bf.readLine()) != null)
            {
                arrayList.add(line);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return arrayList;
    }

    public void checkDuplicates(ArrayList<String> arrayList)
    {

        ArrayList<String> uniqueArrayList = new ArrayList<>();
        ArrayList<String> duplicateArrayList = new ArrayList<>();

        for (int i=0 ; i < arrayList.size() ; i++)
        {
            String item = arrayList.get(i);

            if(!uniqueArrayList.contains(item))
            {
                uniqueArrayList.add(item);
            }
            else
            {
                duplicateArrayList.add(item);
            }
        }
    }

}