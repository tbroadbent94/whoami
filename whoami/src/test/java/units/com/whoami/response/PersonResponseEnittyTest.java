package units.com.whoami.response;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.whoami.enums.StatusCode;
import com.whoami.response.Person;
import com.whoami.response.PersonResponseEntity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonResponseEnittyTest {

    private PersonResponseEntity responseEntity;

    @Before
    public void setup()
    {
        responseEntity = new PersonResponseEntity(StatusCode.OK.getCode(), StatusCode.OK.getDescription(), new Person());
    }

    @Test
    public void getCode()
    {
        Assert.assertEquals(1, responseEntity.getCode());
    }

    @Test
    public void getMessage()
    {
        Assert.assertEquals("Success", responseEntity.getMessage());
    }

    @Test
    public void getPerson()
    {
        Assert.assertNotNull(responseEntity.getPerson());
    }
}
