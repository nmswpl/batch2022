package in.co.nmsworks.exercise3;

import java.util.List;

public class FileMain
{
    public static void main(String[] args) throws Exception {
        ReadTheFile r=new ReadTheFile();
        List<Integer> a=r.readTheFileUsingBuffer("/home/nmsadmin/Downloads/Numbers.txt");
        System.out.println(a);
        FindDuplicate fd=new FindDuplicate();
        List<Integer> dup=fd.toFindDuplicate(a);
        System.out.println(dup);

    }

}
