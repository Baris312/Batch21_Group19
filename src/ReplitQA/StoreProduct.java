package ReplitQA;

public class StoreProduct {
    public String label;
    public int price;
    public String category;
    public boolean hasExpiration;
    public int stock;

    public StoreProduct(String label, int price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    public StoreProduct(String label, int price, int stock) {
        this.label = label;
        this.price = price;
        category = "misc";
        this.stock = stock;
        hasExpiration = false;
    }

    public StoreProduct(String label, int price) {
        this.label = label;
        this.price = price;
        category = "misc";
        this.stock = 0;
        hasExpiration = false;
    }

    public StoreProduct(String label, int price, String category, boolean hasExpiration) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock=0;
    }
    public void expired(boolean hasExpired){
        if(hasExpiration && hasExpired){
            stock=0;
        }
    }
    public boolean sale(int quantity) {
        if(quantity<=stock){
            stock-=quantity;
            return true;
        }else{
            return false;
        }
    }
    public double getDiscountedPrice(double discount){
        return (1-discount)*price;


    }

}
