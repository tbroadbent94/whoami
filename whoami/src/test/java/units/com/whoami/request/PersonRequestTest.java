package units.com.whoami.request;

import com.whoami.request.PersonRequest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonRequestTest {

    private PersonRequest request;

    @Before
    public void setup()
    {
        request = new PersonRequest();
    }

    @Test
    public void getFirst_name()
    {
        request.setFirst_name("tony");

        Assert.assertEquals("tony", request.getFirst_name());
    }

    @Test
    public void getCountry_code()
    {
        request.setCountry_code("UK");

        Assert.assertEquals("UK", request.getCountry_code());
    }
}
