package in.co.nmsworks.excercise2;

public class ArrayOccur{
        public static void main(String[] args) {
            int [] arr = new int [] {1, 2, 3, 2, 2, 3};
            int [] arr1 = new int [arr.length];
            int flag = -1;
            for(int i = 0; i < arr.length; i++){
                int count = 1;
                for(int j = i+1; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        count++;
                        arr1[j] = flag;
                    }
                }
                if(arr1[i] != flag)
                    arr1[i] = count;
            }
               if(arr1[1] != flag)
                    System.out.println(arr[1] + " is :" + arr1[1] +"times");

        }
}
