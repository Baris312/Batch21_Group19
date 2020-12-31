package ReplitQA;
public class Value {


    public int val;
    public boolean modified;

    public Value() {

    }
    public Value(int val)
    {
        this();
        this.val = val;
    }

    public int getVal()
    {
        return val;
    }

    public void setVal(int val)
    {
        this.val = val;
       modified =true;
    }

    public boolean wasModified()
    {
        return modified;
    }



}