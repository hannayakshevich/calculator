package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.services.CalculateService;

public class DivideValuesTest extends BaseTest{

    @Test
    public void verifyDivideValuesTest(){

        int expectedValue = 5;
        int actualValuer = calculateService.divideValues();
        Assert.assertEquals(actualValuer, expectedValue, "Divided correct");
    }
}
