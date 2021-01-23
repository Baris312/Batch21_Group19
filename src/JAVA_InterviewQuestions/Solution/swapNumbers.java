package JAVA_InterviewQuestions.Solution;

public class swapNumbers
    {
        //Swap two variable' values without using a third variable
        public static void main(String[] args)
            {


                int a = 10;
                int b = 30;
                // result should be  a=30; b=10;

                a = a + b;  // a=40
                b = a-b;   // b=10;
                a = a-b  ; // a=30;


            }
    }