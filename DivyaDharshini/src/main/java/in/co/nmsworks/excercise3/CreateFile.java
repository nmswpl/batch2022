package in.co.nmsworks.excercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class CreateFile {

    public List<Integer> readFile(String filePath) throws Exception {
        File file = new File(filePath);
        try(FileReader fr=new FileReader(file);
        BufferedReader br = new BufferedReader(fr)) {
            String str;
            List<Integer> integers = new ArrayList<>();
            while ((str = br.readLine()) != null) {
                integers.add(Integer.valueOf(str));
            }
            System.out.println("Original file :");
            return integers;
        }
    }
}
