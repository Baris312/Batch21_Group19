package JAVA_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Unique {

    public static void main(String[] args) {

        String str = "aaaabbbbbcbbbdddeggghhfi";

        System.out.println(unique(str));

    }

/* 1-
    public static String unique (String str){

        String [] str1= str.split("");
        String result="";


        for (int i=0;i<str1.length;i++)
        {
            int count=0;
            for (int j=0;j< str1.length;j++)
            {
                if (str1[j].equals(str1[i])) count++;
            }
            if (count==1) result+= str1[i];
        }
        return result;
    }

  */

      public static String unique(String str){
          String result ="";
          String [] str1= str.split("");



                          for (String each : str1)
                          {

                                    if (Collections.frequency((Arrays.asList(str1)), each) ==1)
                                    {
                                       result+= each;
                                    }

                          }
              return result;
      }



}

