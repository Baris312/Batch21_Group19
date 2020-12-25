package ReplitQA;

public class Number_IsPalindrome {

    /*
    Write a method called isPalindrome with one int parameter called number.

The method needs to return a boolean.

It should return true if the number is a palindrome number otherwise it should return false.

Check the tips below for more info about palindromes.
     */

    public static void main(String[] args) {

int t = 1221;
        System.out.println(isPalindrome(t) );


        }
 public static boolean isPalindrome (int number){
        String result =  (int ) number + "";
     String  palindrome ="";

     while(number >0)
     {
         int digit = number % 10;
         palindrome += digit+"";
         number /= 10;

     }



     return result.equalsIgnoreCase(palindrome);

        }

    }

