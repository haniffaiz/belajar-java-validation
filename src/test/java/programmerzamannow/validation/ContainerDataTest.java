package programmerzamannow.validation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ContainerDataTest extends AbstractValidatorTest{

    @Test
    void testContainerData() {

        Person person = new Person();
        person.setFirstName("Hanif");
        person.setLastName("Faiz");
        person.setAddress(new Address());
        person.getAddress().setCity("Bogor");
        person.getAddress().setCountry("Indonesia");
        person.getAddress().setStreet("jalan");

        person.setHobbies(new ArrayList<>());
        person.getHobbies().add("");
        person.getHobbies().add("   ");
        person.getHobbies().add("Coding");

        validate(person);
    }
}
