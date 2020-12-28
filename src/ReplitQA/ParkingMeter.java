package ReplitQA;

public class ParkingMeter {

    public  int timeLeft ;
    public int maxTime ;

    ParkingMeter(int maxTime)
    {
        this.maxTime =maxTime;
    }

 public boolean add(int value)
 {
        if (value == 25 || timeLeft >(maxTime-25))
        {
            timeLeft += 30; return true;
        }
        else
        {
       return false;
        }
 }


    public boolean timeleft ()
    {
        return true;
    }

    public  void tick  ()
    {
        if (timeLeft >0)
        {
            timeLeft --;
        }
    }

    public boolean isExpired (){
        return (timeLeft== 0 );
    }




}
