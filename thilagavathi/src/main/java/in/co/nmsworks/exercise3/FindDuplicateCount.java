package in.co.nmsworks.exercise3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FindDuplicateCount {
    public static void main(String[] args) throws IOException {
        FileParsing fileex = new FileParsing();
        List<Integer> list = fileex.readFileUsingBufferedReader("/home/nmsadmin/git/batch2022/thilagavathi/src/main/java/in/co/nmsworks/exercise3/Numbers.txt");
        method2(list);
    }

    public static void method2(List<Integer> list) {
        int num = 0;
        int count = 0;

        List<Integer> dict = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (dict.contains(list.get(i))) {
                System.out.println(list.get(i));
                count++;
            } else {
                dict.add(list.get(i));
            }
        }
        System.out.println("duplicate count" + count);

    }
}


