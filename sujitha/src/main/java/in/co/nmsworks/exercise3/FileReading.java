package in.co.nmsworks.exercise3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileReading
{
    public static List<Integer> readFile(String path) throws Exception
    {
        BufferedReader br=new BufferedReader(new FileReader(path));
        List<Integer> listOfNumbers = new ArrayList<>();
        String numbers;

        while ((numbers=br.readLine())!= null)
        {
            int numbers1=Integer.parseInt(numbers);
            listOfNumbers.add(numbers1);
        }
        return listOfNumbers;
    }

    public static void main(String[] args) throws Exception
    {
      FileReading fr=new FileReading();
      List<Integer> result = fr.readFile("/home/nmsadmin/Downloads/Numbers.txt");
      System.out.println(result);
    }
}
