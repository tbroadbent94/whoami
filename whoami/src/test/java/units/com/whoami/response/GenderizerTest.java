package units.com.whoami.response;

import com.whoami.response.Genderizer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenderizerTest {

    private Genderizer genderizer;

    @Before
    public void setup()
    {
        genderizer = new Genderizer();
    }

    @Test
    public void getName()
    {
        genderizer.setName("tony");

        Assert.assertEquals("tony", genderizer.getName());
    }

    @Test
    public void getGender()
    {
        genderizer.setGender("male");

        Assert.assertEquals("male", genderizer.getGender());
    }

    @Test
    public void getProbability()
    {
        genderizer.setProbability(0.78f);

        Assert.assertEquals(0.78f, genderizer.getProbability(), 0.001);
    }

    @Test
    public void getCount()
    {
        genderizer.setCount(10);

        Assert.assertEquals(10, genderizer.getCount());
    }
}
