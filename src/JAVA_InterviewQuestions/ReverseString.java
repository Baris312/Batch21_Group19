package JAVA_InterviewQuestions;



public class ReverseString {
    public static void main(String[] args) {

      String str ="cybertek"  ;
      String  reverse="";


/*  1-
     String []  rev  = str.split("");

        for (int i =rev.length-1;i>=0;i--) {
            reverse+= rev[i];
        }
        System.out.println(reverse);
*/


/* 2-
            for (int i = str.length() - 1; i >= 0; i--) {

             reverse += str.toCharArray()[i];
            }
            System.out.println(reverse);
*/





 //   3-

   reverse= new StringBuffer(str).reverse().toString();

        System.out.println(reverse);



        }

}





