package ReplitQA;

public class Person_224 {

    private String firstName, lastName;
    private int age;

    public void  Person()
    {
        firstName = "undefined";
        lastName = "undefined";
        age = -1;
    }


    public void Person(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)

    {
        this.lastName = lastName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }


    public String toString() {
        return firstName + " | " + lastName + " | " + age;
    }

}