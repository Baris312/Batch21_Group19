package ReplitQA;

public class OOP_Getter_Setter220 {

    public static void main(String[] args) {

        Db db = new Db();
        db.insertData("aaa",123);


        System.out.println(db.getData());//aaa
        System.out.println(db.getYint());//123

        db.setData("zzz");
        db.setYint(200);

        System.out.println(db.getData());//zzz
        System.out.println(db.getYint());//200

    }

}
 class Db {


   private  String data;
    private  int Yint;



     public String getData()
     {
         return data;
     }

     public void setData(String data)
     {
         this.data = data;
     }

     public int getYint()
     {
         return Yint;
     }

     public void setYint(int Yint)
     {
         this.Yint = Yint;
     }

     public void insertData(String data, int Yint)
     {
         this.data = data;
         this.Yint = Yint;
     }

 }