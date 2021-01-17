package JAVA_InterviewQuestions.Solution;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplication {
    public static void main(String[] args) {

        String str = "aabbdssbbccdeffff";
        String nunDub = "";



/* 1-  split method


     String[]  a = str.split("");

        for (String each : a ) {
           if (!nunDub.contains(each))
           {
               nunDub +=  each+"";
           }

        }
        System.out.println(nunDub);

        }
*/



/* 2- charAt

    public static String  removeDub(String str){
        String nunDub ="";
        for (int i=0; i<str.length();i++){

            if (!nunDub.contains(str.charAt(i)+""))
            nunDub += str.charAt(i)+"";

        }
        return nunDub;
*/

    }
//  3 -   LinkedHas  does not except duplicate items !

        public static String removeDup (String str){

            str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();

            str = str.replace(", ", "").replace("[", "").replace("]", "");

            return str;


        }
    }