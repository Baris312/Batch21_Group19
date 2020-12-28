package ReplitQA;

class Person {
 private String firstName,lastName,ssn;
 private int    birthDay, birthMonth, birthYear;


    public Person(String firstName, String lastName, int birthMonth, int birthDay, int birthYear, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }


    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday ()
    {
     return (birthMonth+"/"+birthDay+"/"+birthYear);
    }

    public boolean verifySSN (String ssn)
    {
        return (this.ssn.equals(ssn));
    }




}
