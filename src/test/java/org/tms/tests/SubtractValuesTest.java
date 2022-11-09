package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractValuesTest extends BaseTest{

    @Test
    public void verifySubtractValuesTest(){
        int expectedResult = 8;
        int actualResult = calculateService.subtractValues();
        Assert.assertEquals(actualResult, expectedResult, "Subtract correct");
    }
}
