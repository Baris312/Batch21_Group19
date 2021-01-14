package JAVA_ClassNotes;

public class OOP_ClassNotes {

    /*
                            *OP: Object Oriented Programming  *****   A PIE

                * 1. Abstraction: abstract, implements, interface
                * 2. Polymorphism: instanceOf
                * 3. Inheritance: extends
                * 4. Encapsulation

*/
  //              *Encapsulation: protect and Hide Data
    /*            - Why we use Encapsulation method ?
                * protect data, fields (instance variable)
                * protect  member of class and some methods from external access ad change  by private.
                * prevent unauthorized setup or modification or access
                * user the getter-s & setter-ing to read and write


                    **** Setter(Write ONLY):
                    * final variables cannot have setter
                    *  public instance method.
                    * returns nothing
                    * returnType is void
                    * passes a parameter (MUST match with instance variable)




*/






 //               *******  Inheritance : to build IS A relationship between the classes.
   /*             *  parent and child classes easiest and fastest way to get rich ==>
                *  *****  extends keyword
                *  IS A RelationIS A Relation VS Has A Relation  ***
                * child class (sub):  can inherit methods and variables from parent class
                * ONLY the visible variables and methods can be inherited
                * Constructor cannot be inherited WithOut "SUPER" class method
                * Parent class (super): Cannot Inherit from sub class
                   ------------------------------------------------------------

                    * Advantages:
                    * reusable less codes
                    *  easy to maintain



                   method Overriding
 *** super keyword ==> super: refers to the object instance. super class
    super.: to call instances.  super class
    super(): to call constructor. super class

***  Constructor call in inheritance:
        1. sub class MUST call super class' constructor
        2. super class' default constructor is called implicitly
        3. if super class' constructor is not default, need to call it manually. super

**** final: Constant ==> cannot be changed

        variables: MUST be initialized. cannot be re-assigned.
        methods: cannot be overridden
        class: class cannot be extended
                final class can  be sub class, but can NEVER be super class




     */





  //  Abstraction And Interface  ; Extend and abstract method and implement methods
    /*


    what we need interface:
        A class can extend one class
        A class implement multiple interfaces
**********  Abstract class                 VS           *******Interface:

1- a class can only extend one abstract class                 1- a class can implement multiple interfaces
2-  everything a regular class can + abstract method            2-  variable: public static and final
                                                                         > methods: abstract method
                                                                            >  static methods
                                                                              > default method




 Abstract and   interface:
                             both used for achieving abstraction
                             both meant to be inherited ( extends, implements)
                             both cannot be final
                             both cannot create objects

     */



    // ===============================================================================
    //                ******** POLYMORPHISM ***********



}