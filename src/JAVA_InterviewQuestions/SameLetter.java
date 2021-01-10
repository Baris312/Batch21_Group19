package JAVA_InterviewQuestions;

import java.util.Arrays;

public class SameLetter {

    public static void main(String[] args) {

String a= "abc";
String b= "bca";

        System.out.println(SameOrNot(a,b));



    }

    //Write a return method that check if a string is build out of the same letters as another string.


    public static  Boolean SameOrNot (String str , String arr){

        char [] str1 = str.toLowerCase().toCharArray();     // to use sort method modify to Array
        char [] arr1 = arr.toLowerCase().toCharArray();

        Arrays.sort(str1);
        Arrays.sort(arr1);

        String strString ="";
        String arrString ="";

        for (Character each : str1 )
        {
            strString += each;
        }
        for (Character each : arr1 )
        {
            arrString += each;
        }

        return strString.equals(arrString);
    }
}
