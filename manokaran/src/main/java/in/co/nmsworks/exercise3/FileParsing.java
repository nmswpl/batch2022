package in.co.nmsworks.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// read the file and return the integers in List
public class FileParsing {
    public static List<Integer> read(String filepath) throws IOException {


        int integer;
        String line;
        List<Integer> listOfNumbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            while ((line = reader.readLine()) != null) {
                integer = Integer.parseInt(line);
                listOfNumbers.add(integer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listOfNumbers;
    }

    public static void main(String[] args) throws IOException {
        String filepath = "/home/nmsadmin/Downloads/Numbers.txt";
        read(filepath);
    }

}
