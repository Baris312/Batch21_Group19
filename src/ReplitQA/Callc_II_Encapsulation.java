package ReplitQA;

public class Callc_II_Encapsulation {
    public static void main(String[] args) {

        Calc a = new Calc();
        a.setX(1);
        a.setY(1);
        a.plus();
        System.out.println("1+1 = " + a.getResult());//1+1 = 2

    }


  private   static class Calc {

       int result, x, y;

        public int setX(int x)
        {
            return this.x=x;
        }


        public int setY(int y)
        { return this.y = y;   // this.  for assign variables in class instead of in-method
        }

        public int getResult()
        {
            return result;
        }

        public void plus() {
           result = (x + y);  // getting values to return method of getResult  assign to result  variable
        }

        public void minus() {
            result= (x - y);
        }



    }

}

