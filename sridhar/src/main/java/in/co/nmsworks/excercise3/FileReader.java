package in.co.nmsworks.excercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public static List<Integer> readFileAndParseAsNumbers(String filePath) {
        java.io.FileReader fileReader =null;
        BufferedReader bufferedReader =null;
        List<Integer> listNumber = new ArrayList<>();
        try {
            String number;
            fileReader = new java.io.FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            while ((number = bufferedReader.readLine()) != null) {
                listNumber.add(Integer.parseInt(number));
            }

        }
        catch (IOException e) {
            System.err.println("Wrong File Path");
        }
        finally
        {
            try {

                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            }
            catch (IOException e)
            {
                System.err.println("File Path is Wrong cannot close the path");
            }
        }
        return listNumber;

    }
}
