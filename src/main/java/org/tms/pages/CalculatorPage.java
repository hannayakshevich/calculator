package org.tms.pages;

public class CalculatorPage {

    private int firstValue = 10;
    private int secondValue = 2;

    public int divideValues(){
        int divideResult = firstValue / secondValue;
        return divideResult;
    }

    public int multiplyValues(){
        int multiplyResult = firstValue * secondValue;
        return multiplyResult;
    }

    public int subtractValues(){
       int subtractResult =  firstValue - secondValue;
       return subtractResult;
    }

    public int summarizeValues(){
        int summarizeResult = firstValue + secondValue;
        return summarizeResult;
    }
}
