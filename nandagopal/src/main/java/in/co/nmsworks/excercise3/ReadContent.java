package in.co.nmsworks.excercise3;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

// Read the file contents for the given file path
public class ReadContent{
    public static List<Integer> readFile(String path) {
        FileReader reader = null;
        ArrayList<Integer> numbers = new ArrayList<>();

        try {
            reader = new FileReader(path);
            int asciiValueOfChar = reader.read();
            String temp = "";

            while(asciiValueOfChar != -1) {
                if(asciiValueOfChar == 10) {
                    numbers.add(Integer.parseInt(temp));
                    temp = "";
                }
                else {
                    temp += (char) asciiValueOfChar;
                }
                asciiValueOfChar = reader.read();
            }
        }

        catch (Exception e) {
            System.out.println("File path not found");
        }

        finally {
            if(reader != null) {
                try {
                    reader.close();
                }
                catch (Exception e) {
                    System.out.println("File reader not read anything");
                }
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        String filePath = "/home/nmsadmin/Desktop/Training/assetFiles/Numbers.txt";
        System.out.println(readFile(filePath));
    }
}
