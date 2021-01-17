package JAVA_InterviewQuestions.Solution;

public class task1
    {
     String name ;
        int n ;
        String color;
        static int v;

public task1(){

}

        public task1(String name, int n, String darkcolor )
            {
                this();

                this.name = name;      //1 this. should use with same name
                                        // 2. static doesnt get this.
                this.n = n;
                color = darkcolor;
            }

        public static int colorbyte(int i){
            return 0;
        }


        public static void main(String[] args)
            {
             task1 obj = new task1("yellow",5,"black");
                   // task1 obj2 = new task1();



                System.out.println(obj);
                System.out.println("3");

                System.out.println(task1.v);

            }
        static
            {
                System.out.println("2");
            }
        static{
            System.out.println("1");
        }

    }
class task2
    {
        public static void main(String[] args)
            {

            }
    }