package in.co.nmsworks.exercisethree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileParser {

    public  List<Integer> filePrint (String path) throws IOException {
        File file = new File(path);
//        String temp = "";
        List<Integer> numberList = new ArrayList<>();
        String parser;
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (null != (parser = bufferedReader.readLine())){
//                if (parser != 10) {
//                    temp += ((char) parser);
//                }
//                else {
//                    numberList.add(temp);
//                    temp = " ";
//                }
                numberList.add(Integer.parseInt(parser));

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return numberList;
    }


    public static void main(String[] args) {

        FileParser fileParser = new FileParser();
        try {
            List<Integer> result = fileParser.filePrint("/home/nmsadmin/Downloads/Numbers.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
