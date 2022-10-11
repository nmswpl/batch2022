package in.co.nmsworks.exercisethree;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatationFinder {

    public static void main(String[] args) throws IOException {

        FileParser duplicateFinder = new FileParser();
        List<Integer> listOfIntegers = duplicateFinder.filePrint("/home/nmsadmin/Downloads/Numbers.txt");
        Set<Integer> setOfIntegers = new HashSet<>();
        int counter = 0;
        for (Integer listOfInteger : listOfIntegers) {  // 2 3 5 67 3 4 2
//            for (int j = i + 1; j < listOfIntegers.size() ; j++) {
//                    if (Objects.equals(listOfIntegers.get(i), listOfIntegers.get(j))){
//                        System.out.println(listOfIntegers.get(i));
//                    }
//            }

            if (setOfIntegers.add(listOfInteger)) {

            }else{
                counter++;
                System.out.println(listOfInteger);
            }
        }
        System.out.println(counter);
    }
}