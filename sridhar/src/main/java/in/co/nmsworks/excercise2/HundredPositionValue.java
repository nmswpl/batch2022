package in.co.nmsworks.excercise2;

import java.util.HashMap;
import java.util.Map;

public class HundredPositionValue {
    public static void main(String[] args) {
        int input1=542,input2=777;
        Map<Integer,String> numbers=new HashMap<>();

        String[] numberString={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

        for (int i=0; i< numberString.length; i++)
        {
            numbers.put(i+1, numberString[i]);
        }

        input1=input1/100;
        input2=input2/100;

        System.out.println(numbers.get(input1));
        System.out.println(numbers.get(input2));
//        for(int i=0;i<numbers.size();i++)
//        {
//            if( i == input1 )
//            {
//                System.out.println("Output is: "+numbers.get(i));
//            }
//            if( i == input2 )
//            {
//                System.out.println("Output is: "+numbers.get(i));
//            }
//
//        }

    }
}
