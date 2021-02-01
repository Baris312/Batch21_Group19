package JAVA_InterviewQuestions.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_Ahmed
    {
        //Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
        //Write a java operation to remove all the names named Ahmed

        public static void main(String[] args)
            {


                ArrayList<String> arr = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

                while(arr.contains("Ahmed"))
                    {
                        arr.remove("Ahmed");
                    }

                System.out.println(arr);




            }
    }