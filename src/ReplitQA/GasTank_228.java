package ReplitQA;

public class GasTank_228 {

    public double amount;
    public double capacity;

    public GasTank_228(double capacity)
    {
        this.capacity = capacity;
    }


    public  void  addGas(double amount)
    {
        this.amount+= amount;
       if (amount > capacity ){ this.amount = capacity;}
    }


    public void useGas  (double amount)
    {
        this.amount-=amount;
        if( amount<0) {this.amount =0;}
    }

    public boolean isEmpty()
    {
         return (amount< 0.1);
    }

    public boolean isFull()
    {
       return (amount > capacity-0.1 );
    }


    public double getGasLevel()
    {
       return amount;
    }

    public double fillUp()
    {
        return capacity -amount;
    }








}
