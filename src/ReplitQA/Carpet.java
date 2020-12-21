package ReplitQA;

public class Carpet {



        public double width, length, unitPrice, totalPrice;
        public boolean isPersian;
        //do not change -- End

        //Add constructors below



        Carpet(double width, double length, double unitPrice, boolean isPersian) {
            this.width = width;
            this.length = length;
            this.unitPrice = unitPrice;
            totalPrice = total();
            this.isPersian = isPersian;

        }

        public double total() {
            double total = 0;
            return total = (isPersian = true) ? totalPrice + 200 : totalPrice;
        }

    public static void main(String[] args) {
        Carpet c = new Carpet(20, 20, 2, true);
        System.out.println(c.totalPrice);

    }


    }


