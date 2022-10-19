package Oving8;

public class Person {
    private final String firstname;
    private final String lastname;
    private final int yearOfBirth;


    /**
     * Constructor for Person
     * @param firstname First name of the person
     * @param lastname Last name of the person
     * @param yearOfBirth Year of birth of the person
     */
    public Person(String firstname, String lastname, int yearOfBirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * Makes the variable firstname accessible outside the class
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Makes the variable lastname accessible outside the class
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Makes the variable yearOfBirth accessible outside the class
     * @return the yearOfBirth
     */
    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
