package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SummarizeValuesTest extends BaseTest{

    @Test
    public void verifySummarizeValuesTest(){
        int expectedResult = 12;
        int actualResult = calculateService.summarizeValues();
        Assert.assertEquals(actualResult, expectedResult, "Summarize correct");
    }
}
