package ReplitQA;

import java.util.ArrayList;

public class Methods214 {

/*
------- 1st way to doit -----
    public static String search(ArrayList<String> r, String find)
    {
        r.removeIf(p-> !p.contains(find));

return (!r.isEmpty())? r.toString() :  "search failed";



    }//end wineSeller

  //  used removedIf  to remove all word doesnt contains find word !
   // return used ternary to  if r is empty  should say "search failed" or print  r WITH .toString
   */

    public static String search(ArrayList<String> r, String find)
    {

        String result ="";
        for ( String each : r  ) {

            if(each.contains(find)){
            result+=each;
            }
}
return (result.length()>0)? result: "search failed";
    }//end wineSeller





    public static void main(String[] args)
    {

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");


        String find_tst = search(arr,"foo");
        System.out.print(find_tst);//foo bar


    }//end main
}


