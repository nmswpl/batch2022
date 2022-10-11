package in.co.nmsworks.exercise3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NoOfOcc {

    public static void main(String[] args) throws Exception {
        List<Integer> val = BufferReader.Readfile("/home/nmsadmin/Downloads/Numbers.txt");

        Map<Integer, Integer> mapcountlist = new HashMap<>();


        for (int x : val) {

            if (mapcountlist.containsKey(x)) {
                mapcountlist.put(x, (mapcountlist.get(x) + 1));

            } else {
                mapcountlist.put(x, 1);
            }
        }

        System.out.println(mapcountlist);
        System.out.println(mapcountlist.size());

        //-------------------------------No Of Times------------------------------------------

        Map<Integer, List<Integer>> mapnooftimes = new HashMap<>();

        for (int valuemap : mapcountlist.keySet()) {
            int num = mapcountlist.get(valuemap);
            if(mapnooftimes.containsKey(num))
            {
                mapnooftimes.get(num).add(valuemap);
            }

          else
            {
                List<Integer> finallist = new ArrayList<>();
                finallist.add(num);
                mapnooftimes.put(num,finallist);
            }
        }
        System.out.println(mapnooftimes);
    }
}






    


