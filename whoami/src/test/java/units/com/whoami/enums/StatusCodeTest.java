package units.com.whoami.enums;

import com.whoami.enums.StatusCode;
import org.junit.Assert;
import org.junit.Test;

public class StatusCodeTest {

    @Test
    public void getFeatureType()
    {
        for(StatusCode code : StatusCode.values())
        {
            Assert.assertNotEquals("", code.getDescription());
            Assert.assertNotEquals("", code.getName());
            Assert.assertNotNull(code.getCode());
        }
    }
}
