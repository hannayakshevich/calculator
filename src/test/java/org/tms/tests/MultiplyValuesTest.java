package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyValuesTest extends BaseTest{

    @Test
    public void verifyMultiplyValuesTest(){
        int expectedValue = 20;
        int actualValue = calculateService.multiplyValues();
        Assert.assertEquals(actualValue, expectedValue, "Multiply correct");
    }
}
