package JAVA_InterviewQuestions.Solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_Min {
    public static void main(String[] args) {


        int[] num = {1, 20, 50, 4, 7, 12};
        System.out.println(min(num));

    }
    /*
        public static int min(int [] num){
            int min=5000;  // must initialize  min as max as possible , we will reassign if we get lower number

            for (int each: num )
            {
                if (each<min)  min=each;
            }
            return min;
        }


     */
    //   2-
    public static int min(int [] num) {
        int min= Integer.MAX_VALUE;
        for (int each : num ) {
            min = Math.min(each, min);
        }

        return min ;

    }
/* 3-
            public static int min(int [] num){
                Arrays.sort(num);
                return num[0];
            }




            */




}


