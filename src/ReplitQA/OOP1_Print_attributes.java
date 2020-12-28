package ReplitQA;

public class OOP1_Print_attributes {

        public String name , color;
        public  int  amount;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)

    {
        this.color = color;
    }

    public int getAmount()
    {
        return amount;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }



    public String asString() {
        return "name: " + name + " color: " + color + " amount: " + amount ;
    }
}
