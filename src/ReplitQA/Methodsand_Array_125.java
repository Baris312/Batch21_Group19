package ReplitQA;

public class Methodsand_Array_125 {





        public static void main(String[] args) {

            int[] str = {1, 1, 1, 0, 0, 0, 0, 0};

            System.out.println(badP(str, 5));


        }

/*  1st way to do it :
    public static boolean badP(int[] products, int limit) {



      int result0 =  Collections.frequency(Arrays.asList(products),0);
//                  use collections  only if you have list  , array or arraylist ;)

      return (result0 <limit);

    }

   */

        public static boolean badP(int[] products, int limit) {
            int count = 0;
            for (int each : products) {

                if (each == 0) {
                    count++;
                }

            }
            return count < limit;
        }


    }
