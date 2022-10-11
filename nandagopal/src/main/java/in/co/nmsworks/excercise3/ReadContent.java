package in.co.nmsworks.excercise3;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

// Read the file contents for the given file path
public class ReadContent{
    public static List<Integer> readFile(String path) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();

        try (FileReader reader = new FileReader(path)) {
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

        return numbers;
    }
}
