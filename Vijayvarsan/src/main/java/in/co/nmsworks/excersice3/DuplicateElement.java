package in.co.nmsworks.excersice3;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElement {

    //1.Write a program to find the duplicate elements in the given file.




    public static void main(String[] args) throws Exception {
        FileCreation path=new FileCreation();
       List<Integer> list= path.fileRead("/home/nmsadmin/Downloads/Numbers.txt");
       int count=0;
        System.out.println("LIST"+list);
        Set<Integer> dupSet=new HashSet<>();
        for(int i=0;i<list.size();i++){
            if (dupSet.add(list.get(i))) {
            }
                else {
                    count++;
            }

//        for (int i=0;i<list.size();i++) {
//            for (int j = 0; j < list.size(); j++) {
//                if (list.get(i).equals(list.get(j))) {
//                    count ++;
//                }
//            }
//            if(count>2)
//                System.out.println(list.get(i)+"=count="+count);
//            count=0;
        }
        System.out.println(count+"=as a number of duplicates");
        System.out.println(dupSet);
    }
}
