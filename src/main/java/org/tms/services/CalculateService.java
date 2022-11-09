package org.tms.services;


import org.tms.pages.CalculatorPage;

public class CalculateService {

    protected CalculatorPage calculatorPage = new CalculatorPage();

    public int divideValues(){
        return calculatorPage.divideValues();
    }

    public int multiplyValues(){
        return calculatorPage.multiplyValues();
    }

    public int subtractValues(){
        return calculatorPage.subtractValues();
    }

    public int summarizeValues(){
        return calculatorPage.summarizeValues();
    }

}
