package units.com.whoami.response;

import com.whoami.response.Agify;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AgifyTest {

    private Agify agify;

    @Before
    public void setup()
    {
        agify = new Agify();
    }

    @Test
    public void getName()
    {
        agify.setName("tony");

        Assert.assertEquals("tony", agify.getName());
    }

    @Test
    public void getAge()
    {
        agify.setAge(25);

        Assert.assertEquals(25, agify.getAge());
    }

    @Test
    public void getCount()
    {
        agify.setCount(3434343);

        Assert.assertEquals(3434343, agify.getCount());
    }
}
