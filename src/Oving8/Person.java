package Oving8;

public class Person {
    private final String firstname;
    private final String lastname;
    private final int yearOfBirth;

    public Person(String firstname, String lastname, int yearOfBirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String toString() {
        return firstname + " " + lastname + " (" + yearOfBirth + ")";
    }
}
