import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.ldap.Rdn;

public class unitTestFile {
    RatesParser ratesParser;
    @Before
    public void setupTestFile(){
        ratesParser = new RatesParser ("resources/rates.json");
    }

    @Test
    public void returnsSuccessTrue(){
        Assert.assertEquals("true", ratesParser.getJSONSuccess());
    }

    @Test
    public void returnsCorrectValue(){
        Assert.assertEquals(4.234904, ratesParser.getRate ("AED"));    }

}
