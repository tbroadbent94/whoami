package units.com.whoami.service;

import com.whoami.request.PersonRequest;
import com.whoami.response.Person;
import com.whoami.service.WhoAmIServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WhoAmIServiceImplTest {

    private WhoAmIServiceImpl service;
    private PersonRequest request;
    private Person person;

    @Before
    public void setup()
    {
        request = mock(PersonRequest.class);
        service = new WhoAmIServiceImpl();
    }

    @Test
    public void getWhoAmIServiceImplTest()
    {
        when(request.getFirst_name()).thenReturn("tony");
        when(request.getCountry_code()).thenReturn("UK");

        person = service.getWhoIAm(request);

        Assert.assertNotNull(person);
        Assert.assertTrue(person.getName().equals("tony"));
        Assert.assertTrue(person.getCountry_code().equals("UK"));
        Assert.assertNotNull(person.getGender());
        Assert.assertNotNull(person.getAge());
    }


}
