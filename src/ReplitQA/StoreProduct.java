package ReplitQA;


public class StoreProduct {


    String label;
    int price;
    String category;
    boolean hasExpiration;
    int stock;

    //1.  A secondary constructor that does not have
    //a category, expiration, or stock (stock defaults to 0)
    public StoreProduct(String label, int price) {
        this.label = label;
        this.price = price;
        this.stock = 0;
        category = "misc";
        hasExpiration = false;
    }

    //2.  A secondary constructor that just does not have stock
    public StoreProduct(String label, int price, String category, boolean hasExpiration) {
        this(label, price);
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = 0;
    }

    //3. A secondary constructor that does not have a category or an expiration
    // (category defaults to "misc", hasExpiration defaults to false)
    public StoreProduct(String label, int price, int stock) {
        this(label, price);
        this.stock = stock;
        category = "misc";
        hasExpiration = false;
    }

    //4. the main Constructor: has everything
    public StoreProduct(String label, int price, String category, boolean hasExpiration, int stock) {
        this(label, price, stock);
        this.category = category;
        this.hasExpiration = hasExpiration;
    }


    public void expired(boolean hasExpired) {
        if (hasExpired) {
            stock = 0;
        }
    }

    public boolean sale(int quantity) {
        if (quantity <= stock) stock -= quantity;

        return (quantity < stock);
    }

    public double getDiscountedPrice(double discount) {
        return (1 - discount) * price;
    }

}