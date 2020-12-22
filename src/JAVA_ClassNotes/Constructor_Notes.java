package JAVA_ClassNotes;

public class Constructor_Notes {
    /*
        ***********  Constructor: very special every class MUST have it .************
            if we dont create, compiler creates one (with no argument)only gets executed when we create the object

    Class & Object:
  -  instance variables ,
  -  instance methods
  -  this.
  -  this();
  -  toString();
  -  Constructor


    statics:
   - static variable,
   - static methods,
   - static block,
   - static imports,


         *** Constructor call:
            * this()
            * 1. only a constructor can call another constructor
            * 2. constructor can be overloaded. the only way to have more than one constructor in class
            * 3. constructor cannot be called by constructor name. we need this()
            * 4. constructor call MUST be at first step
            * 5. one constructor can ONLY call one constructor
            * 6. Constructor cannot call or contain itself


  *** Constructor call in inheritance:
        1. sub class MUST call super class' constructor
        2. super class' default constructor is called implicitly
        3. if super class' constructor is not default, need to call it manually. super



    this: refers to the object instance. current class
    this.: to call instances. current class
    this(): to call constructor. current class
     */
}
