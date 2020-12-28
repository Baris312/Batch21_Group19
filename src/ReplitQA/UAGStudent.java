package ReplitQA;



public class UAGStudent {
    public  String name;
    public int grade;
    public  static String principalName ="Ms. McKoy";
    public  String studentID;
    public static int nextID= 100;

    public UAGStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
        studentID= getStudentID();
        nextID++;
    }

    public String getStudentID()
    {

        return   name.substring(0,1).toUpperCase()+nextID;

    }

    public static void newPrincipal(String name )
    {
        principalName =name;
    }

    public static void  resetID ()
    {
        nextID =100;
    }


    public String toString() {
        return    name +  " " + studentID ;
    }
}
