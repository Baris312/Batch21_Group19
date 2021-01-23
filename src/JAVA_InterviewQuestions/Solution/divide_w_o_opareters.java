package JAVA_InterviewQuestions.Solution;

public class divide_w_o_opareters
    {
/*
Write a method that can divide two numbers without using division operator
 */

        public static void divide(int num1,int num2)
            {
                System.out.print(num1 + " divide by "+num2 +" is ;");

                    int count=0;

                while(num1 >= num2 & num2>0)
                    {
                    num1-=num2;
                    count++;
                    }
                System.out.println(count + " and reminder ; "+num1);

            }






        public static void main(String[] args)
            {
                divide(7,2);
            }

    }
