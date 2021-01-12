package JAVA_InterviewQuestions.Solution;

public class SumOfString_Digits {
    public static void main(String[] args) {



    String str = "12345";

    int sum=0;
//     Using collections
//
//    char [] ch = str.toCharArray();

//    for(Character each : ch ){
//       if (Character.isDigit(each))  sum += Integer.parseInt(each+"");
//
//    }
//        System.out.println(sum);
//

        // without collection
    int n = Integer.parseInt(str);

    while(n>0){
        sum += n%10 ;
        n= n/10;
    }
        System.out.println(sum);

}
}
