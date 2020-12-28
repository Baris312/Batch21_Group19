package ReplitQA;


public class StoreProduct {

   public String label;
   public int price;
   public String category;
   public boolean hasExpiration;
   public int stock ;


    public StoreProduct(String label, int price, String category, boolean hasExpiration, int stock)
    {
        this.label = label;
        this.price = price;
        this.category = "misc";
        this.hasExpiration = false;
        this.stock = stock;
    }

    public StoreProduct(String label, int price, int stock)
    {
        this.label = label;
        this.price = price;
        this.stock = stock;
        category="misc";
        hasExpiration=false;
    }

    public StoreProduct(String label, int price)
    {
        this.label = label;
        this.price = price;
        stock= 0;
        category="misc";
        hasExpiration=false;
    }

    public StoreProduct(String label, int price, String category, boolean hasExpiration)
    {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;

    }

    public void expired(boolean hasExpired)
    {
      if  (hasExpiration && hasExpired ) stock = 0 ;
    }



    public boolean sale(int quantity )
    {
      if (quantity<= stock )   stock-= quantity;

     return (quantity< stock ) ;
    }

     public double getDiscountedPrice(double discount)
     {
         return price -= discount * price;
     }


}
