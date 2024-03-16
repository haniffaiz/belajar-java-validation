package programmerzamannow.validation;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Person {

    @Size(max = 20, message="first name length max must 20 character")
    @NotBlank(message = "first name can not blank")
    private String firstName;

    @Size(max = 20, message="first name length max must 20 character")
    @NotBlank(message = "last name can not blank")
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
