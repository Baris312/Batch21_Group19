package ReplitQA;

public class EducationalInstitution {
    private int years;


    public EducationalInstitution(int years) {
        this.years = years;
    }

    public String graduationRequirements()
    {
        return years+" years of study";
    }


/*
a (default) constructor (No-Arg) that invokes the superclass
 constructor with the value 3 (law school is typically a three year program).
 */

    static class LawSchool extends EducationalInstitution {

        public LawSchool() {
            super(3);
        }
/*
a (overridden) method graduationRequirements that returns
the string "3 years of study and passing the bar".
You MUST invoke the graduationRequirements method of the superclass
 in this method (to obtain the first portion of the resulting string).
 */
        public String graduationRequirements()
        {
            return "3 years of study and passing the bar";
        }


    }

}
