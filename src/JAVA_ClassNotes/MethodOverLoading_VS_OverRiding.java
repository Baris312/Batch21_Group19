package JAVA_ClassNotes;

public class MethodOverLoading_VS_OverRiding {

}
/*

                                    *******  OverLoading ************

            *  Any method can be overloaded
            *  Providing two or more separate methods in a class with SAME NAME but DIFFERENT PARAMETERS
                                                                        --------------------------------
            * method return type can be different and it allow us to use same method name .
            *  its help us to less duplicate codes
            * Can over load static
            *  can be overload inside or in subclass if;
            * must have  same method name
            * must have different parameters
            * can have different access modifier

 why we need this?
       * to give different implementation to the method
       * Advantages:
       - flexible
       - reusable
       - less memory

** Object class: from  "java.lang", parent of all classes. implicitly done
---------------------------------------------------------------------------

                                      ****  OVERRIDING

* MUST  be apply in subclass that already exist in parent class  signature (same name , same parameters)
* its better to use @ annotation to se overriding  successful
* return type  must same return type of parent class
* Methods are final can not be overriding
* Subclass an use super.methodName()   o call the superclass version of overridden method
* ONLY instance can be overridden (private)
* access modifier: MUST be same or more visible
 * visibility:
                           -> public > protected > default
                   *** methods that cannot be overridden: private, static, constructor, final
                   ---------------------------------------------------------------------------




          OverLoading                 VS                          OverRiding
  overloads static and instance                             can not overRide static
must have same name & different parameters                  Same name & Same parameters
    return type can be different                            must same return type of parent class
  can have different access modifier                        must have same or more visible  access modifier
Any  Method can be overLoading                              Only inherited methods overriding
Constructors and private can be overload                   CAN NOT Override Constructors and private





 */