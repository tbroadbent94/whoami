package units.com.whoami.controller;

import com.whoami.controller.WhoAmIController;
import com.whoami.request.PersonRequest;
import com.whoami.response.Person;
import com.whoami.response.PersonResponseEntity;
import com.whoami.service.WhoAmIService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.ObjectUtils;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WhoAmIControllerTest {

    private WhoAmIService service;
    private WhoAmIController controller;
    private PersonRequest request;
    private PersonResponseEntity response;

    @Before
    public void setup()
    {
        service = mock(WhoAmIService.class);
        request = mock(PersonRequest.class);
        response = mock(PersonResponseEntity.class);
        controller = new WhoAmIController(service);
    }

    @Test
    public void whoIAmControllerTest()
    {
        when(service.getWhoIAm(request)).thenReturn(new Person());

        response = controller.returnWhoIAm(request);

        Assert.assertNotNull(response.getPerson());
        Assert.assertTrue(response.getMessage().equals("Success"));
        Assert.assertTrue(response.getCode() == 1);
    }

    @Test
    public void whoIAmControllerTest_thirdPartyFailure()
    {
        when(service.getWhoIAm(request)).thenReturn(null);

        response = controller.returnWhoIAm(request);

        Assert.assertTrue(ObjectUtils.isEmpty(response.getPerson()));
        Assert.assertTrue(response.getMessage().equals("An error has occured with a third party api"));
        Assert.assertTrue(response.getCode() == 2);
    }
}
