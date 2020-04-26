package units.com.whoami.response;

import com.whoami.response.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    private Person person;

    @Before
    public void setup()
    {
        person = new Person();
    }

    @Test
    public void getName()
    {
        person.setName("tony");

        Assert.assertEquals("tony", person.getName());
    }

    @Test
    public void getGender()
    {
        person.setGender("male");

        Assert.assertEquals("male", person.getGender());
    }

    @Test
    public void getAge()
    {
        person.setAge(25);

        Assert.assertEquals(25, person.getAge());
    }

    @Test
    public void getCountry_code()
    {
        person.setCountry_code("UK");

        Assert.assertEquals("UK", person.getCountry_code());
    }

}
