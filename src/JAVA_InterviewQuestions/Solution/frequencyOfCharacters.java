package JAVA_InterviewQuestions.Solution;

import java.util.Arrays;
import java.util.Collections;

public class frequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aaaaabbbbbddddaaaaeeeefgheee";

        System.out.println(frequencyOfCharacters(str));


          }


        public static String frequencyOfCharacters (String str)
    {

        String[] arr = str.split("");   // 1- split each char and put them in array
        String result = "";   // 2- create new string for result


        for(int i=0; i < arr.length; i++)   // 3 - find their frequency
        {


         int  count =  Collections.frequency(Arrays.asList(arr),arr[i]);
//            for (int j=0;j< arr.length;j++)
//            {
//            if (arr[j].equals(arr[i]))
//            {
//                count++;
//          }

  //          }
         if (!result.contains(arr[i]))
         {
             result += arr[i] + count;   // add char if its not contain already > concat with count  when you add
         }
        }
      return   result;

       }



/*
    public static String frequencyOfCharacters (String str)
    {
        String result="";  // create empty string for return result
        // replace first char after find count and add to result
        // continue until no more char left in string
        while(!str.isEmpty())
        {
            int count =0;
            for (Character each: str.toCharArray() )
            {
                if (each.equals(str.charAt(0)))
                    count++;
            }
            result+= ""+str.charAt(0)+count;
            str= str.replace(str.charAt(0)+"","");

        }

        return result;

    }


 */
/*
            Solution 3:

            // LinkedHash  does not accept duplicated char so when we found frequency of char we can create result
            we have to split and remove spit , after from list



            public  static  String  FrequencyOfChars(String str) {

            String b=new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();

              b = b.replace(", ","").replace("[","").replace("]","");

            String result="";

            for(int j=0; j<b.length();j++) {

            int count=0;

            for(int i=0; i<str.length(); i++){

            if(str.substring(i, i+1).equals(""+str.charAt(j)))

            count++;

            }

            result+=b.substring(j, j+1)+count;
            }

                return result;

       }

 */


}
