package ReplitQA;

public class SumOfNumbers {

    /*
    Write method  of int number , if its lesthan 10  number = -1 if  parameter num>= 10 total each digit from number

     */

    public static void main(String[] args) {
        System.out.println("the sum of number of 125 is "+ Sum(125)); // 1+2+5= 8
        System.out.println("the sum of number of -125 is "+ Sum(-125)); // -1
        System.out.println("the sum of number of 5 is "+ Sum(5));      // -1
        System.out.println("the sum of number of 345621 is "+ Sum(345621)); // 3+4+5+6+2+1=21
    }

    private static int Sum(int number){

        if (number < 10 )
        {
            return -1;
        }
        int sum=0;
        while (number>0)
        {
            int digit = number % 10 ;  // this will bring last remaining number
            sum+= digit; // add last number from % 10 => ex number 125 => digit 5, number 3434532 => digit=2
            number /= 10;   // this will cut last number = ex number was 125=> became 12 and digit =2
        }

        return sum;
    }

}
