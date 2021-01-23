package JAVA_InterviewQuestions.Solution;

public class FINRA
    {
        /*
        Write a method which prints out the numbers from 1 to 30 but for numbers
         which are  a multiple of 3, print "FIN" instead of the number and
         for numbers   which are a multiple of 5, print "RA" instead of the number.
          for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
         */
/*

       //1-    Write a method which prints out the numbers

        public static void Finra()
        {
        // 2- prints out the numbers from 1 to 30 but for numbers
            for (int i = 1; i <= 30; i++)
                {

                    // 5-  for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

                    if (i %3==0 && i %5==0) System.out.println("FINRA");

              //3-   which are  a multiple of 3, print "FIN" instead of the number and
            else if (i %3==0 ) System.out.println("FIN");
             // 4- for numbers   which are a multiple of 5, print "RA" instead of the number.
           else  if (i %5==0) System.out.println("RA");
              // 6 - else print number
             else System.out.println(i);


                }


*/

        public static void Finra ()
        {
            String result="";

            for (int i = 1; i <=30 ; i++)
                {
                    result += (i % 3==0 & i%5 ==0)?"FINRA  ":(i %3==0)? "FIN  ":(i %5==0 )?" RA  ":i+" ";
                }
            System.out.println(result);


        }

        public static void main(String[] args)
            {
                Finra();
            }

    }
