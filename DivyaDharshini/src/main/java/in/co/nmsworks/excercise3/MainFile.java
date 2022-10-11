package in.co.nmsworks.excercise3;

import java.util.List;

public class MainFile {
    public static void main(String [] args) throws Exception
    {
        CreateFile createFile =new CreateFile();
        String filePath="/home/nmsadmin/Downloads/Numbers.txt";
        List<Integer> a= createFile.readFile(filePath);
        System.out.println(a);

        Duplicate duplicate=new Duplicate();
        List<Integer> b=duplicate.duplicateFile(a);
        System.out.println(b);


      }
}
