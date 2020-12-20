package ReplitQA;

import java.util.ArrayList;
import java.util.Arrays;

public class TimesTwo {
/*
    public static void  timesTwo (ArrayList<Integer> nums  )
    {
         ArrayList<Integer> num1= new ArrayList<>();   // Create  another list add new created number

        for (int i =0;i<nums.size();i++) {
        num1.add( nums.get(i)*2);
        }
        System.out.println(num1);
    }

   */

    public  static void  timesTwo (ArrayList<Integer> nums  )
    {
          int i =0;
        for (int each : nums){
         nums.set(i,(each*2) );    // set method only works set(index , element)
         i++;
        }
        System.out.println(nums);
    }




    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        timesTwo(list);
    }
}
