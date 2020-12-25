package JAVA_ClassNotes;

public class OOP_ClassNotes {

    /*
                            *OP: Object Oriented Programming  *****   A PIE
                * 1. Encapsulation
                * 2. Inheritance: extends
                * 3. Abstraction: abstract, implmenets, interface
                * 4. Polymorphism: instanceOf



                *Encapsulation:
                * hiding data, fields (instance variable)
                * hiding the data by private.
                * user the getter-s & setter-ing to read and write


                    **** Setter(Write ONLY):
                    * final variables cannot have setter
                    *  public instance method.
                    * returns nothing
                    * returnType is void
                    * passes a parameter (MUST match with instance variable)





                *******  Inheritance : to build IS A relationship between the classes.
                *  parent and child classes easiest and fastest way to get rich ==>
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



Method overloading: same method name, different parameters
        returnType does not matter
        Any method can be overloaded
method overriding: same method name, same parameter
                       * MUST happen in subclass
                       * ONLY instance can be overridden (private)
                       * access modifier: MUST be same or more visible
                       * returnType: MUST be same
                       * @override annotation MUST be applicable
                       * visibility:
                           -> public > protected > default
                   *** methods that cannot be overridden: private, static, constructor, final
                   ---------------------------------------------------------------------------


    why we need this?
       * to give different implementation to the method
       * Advantages:
       - flexible
       - reusable
       - less memory

** Object class: from  "java.lang", parent of all classes. implicitly done
---------------------------------------------------------------------------
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
}