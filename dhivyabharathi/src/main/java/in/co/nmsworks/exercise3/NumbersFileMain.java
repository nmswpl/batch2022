package in.co.nmsworks.exercise3;

import java.io.IOException;
import java.util.List;

public class NumbersFileMain {
    public static void main(String[] args) throws IOException {
    NumbersFile nf = new NumbersFile();
   List<Integer> list = nf.readData("/home/nmsadmin/git/batch2022/dhivyabharathi/src/main/java/in/co/nmsworks/exercise3/Numbers.txt");

    FindDuplicate fd = new FindDuplicate();
    fd.duplicate(list);
    }
}
