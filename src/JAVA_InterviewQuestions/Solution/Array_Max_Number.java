package JAVA_InterviewQuestions.Solution;

import java.util.Arrays;

public class Array_Max_Number {
    public static void main(String[] args) {


        int[] num = {1, 20, 50, 4, 7, 12};

        System.out.println(max(num));


    }
/*
    public static int max(int [] num){
        int max=0;  // must initialize  max as min as possible , we will reassign if we get bigger number

        for (int each: num )
        {
            if (each>max)  max=each;
        }
        return max;
    }


 */
  //   2-
    public static int max(int [] num) {
       int max= Integer.MIN_VALUE;
        for (int each : num ) {
            max = Math.max(each, max);
        }

            return max ;

    }
/* 3-
            public static int max(int [] num){
                Arrays.sort(num);
                return num[num.length-1];
            }



 */
}
