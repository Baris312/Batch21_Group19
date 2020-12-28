package ReplitQA;

public class Pizza {
    private String small, medium ,large;
    public int CheeseToppings, PepperoniTopping, HamTopping;
    public String size ="";
    public  double total;

    public Pizza(String size,int cheeseTopping, int pepperoniTopping, int hamTopping)
    {
        this.CheeseToppings = cheeseTopping;
        this.PepperoniTopping = pepperoniTopping;
        this.HamTopping = hamTopping;
        this.size = size;
        total = calcCost();
    }


    public double calcCost()
    {

        double startPrice= (size.equalsIgnoreCase("small"))? 10:
                (size.equalsIgnoreCase("medium"))? 12 : 14;
        double cheese = 2 * CheeseToppings;
        double pepperoni = 2 * PepperoniTopping;
        double ham = 2* HamTopping;

        return startPrice+cheese+pepperoni+ham ;


    }



    public String toString() {
        return size + " Pizza with " + CheeseToppings +
                " Cheese toppings, " + PepperoniTopping +
                " Pepperoni toppings , and " +  HamTopping +
                " Ham toppings." +  "\nTotal Price: "+ calcCost();


    }

    public static void main(String[] args) {
        Pizza pizza1 =new Pizza("large",0,0,2);
        System.out.println(pizza1);
    }

}
