import org.junit.Assert;
import org.junit.Test;
import zera.service.MathService;

public class MathServiceTest {
    @Test
    public void testSum(){
        MathService mathService = new MathService();
        int act = mathService.sum(1,2);
        int expected = 3;
        Assert.assertEquals(expected,act);
    }
}
