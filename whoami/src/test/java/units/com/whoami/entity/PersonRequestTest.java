package units.com.whoami.entity;

import com.whoami.request.PersonRequest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonRequestTest {

    private PersonRequest personRequest;

    @Before
    public void setup()
    {
        personRequest = new PersonRequest();
    }

    @Test
    public void getFirst_name()
    {
        personRequest.setFirst_name("tony");

        Assert.assertEquals("tony", personRequest.getFirst_name());
    }

    @Test
    public void getCountry_code()
    {
        personRequest.setCountry_code("UK");

        Assert.assertEquals("UK", personRequest.getCountry_code());
    }
}
