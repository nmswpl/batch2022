package in.co.nmsworks.exercise3;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NoOfOcc {

    public static void main(String[] args) throws Exception
    {
        List<Integer> val = BufferReader.Readfile("/home/nmsadmin/Downloads/Numbers.txt");

        Map<Integer,Integer> mapcountlist=new HashMap<>();

        for(int x:val){

            if(mapcountlist.containsKey(x))
            {
                mapcountlist.put(x,(mapcountlist.get(x)+1));

            }
            else
            {
                  mapcountlist.put(x,1);
            }
        }

        System.out.println(mapcountlist);
        System.out.println(mapcountlist.size());




//
//        for(int x:val)
//        {
//            int count = 0;
//            for(int y:val)
//            {
//                if(x==y)
//                {
//                    count++;
//                }
//            }
//            mapcountlist.put(x,count);
//        }
//        System.out.println(mapcountlist);
//        System.out.println(mapcountlist.size());
    }
    
}

