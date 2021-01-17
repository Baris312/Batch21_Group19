package JAVA_ClassNotes;

public class Static_Block {
  static int v;
   static String b;
  //  static String a ="you can use static ";
    static {
        v=5;
        b ="final";
        System.out.println("you dont need main method to run this ");
        System.exit(0); // this will stop main to print anything else or other methods
    }

    public static void main(String[] args) {
      System.out.println("test");
//       static int v=10;
//       static String a ="you can use static ";
        System.out.println( Static_Block.v);
    }

}
class c{


}


/*   Static Block ; It is a static initializer.
 It's executed when the class is loaded and a good place to put initialization of static variables.

Benefits of static blocks ;

1 * Static block can be used to show that a program can run without main function also. see example @  top .

2 * It's a block of code which is executed when the class gets loaded by a classloader.
It is meant to do initialization of static members of the class

3 * Static blocks has priority  it will run first static class and block than main and others .








 */