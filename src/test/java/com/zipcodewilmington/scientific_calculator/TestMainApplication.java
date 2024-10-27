package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.InverseFunction;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {


    @Test
    public void testSquareRoot() {

        MainApplication mainApplication = new MainApplication();
        double result = mainApplication.squareRoot(4);
        assertEquals(2, result, 0.001);

    }

    @Test
    public void testsquare() {
        MainApplication mainApplication = new MainApplication();
        double sq = mainApplication.square(2);
        assertEquals(4, sq, 0.001);

    }

    @Test
    public void exponentiation() {
        MainApplication mainApplication = new MainApplication();
        double exp = mainApplication.exponentiation(2);
        assertEquals(7.38905609893065, exp, 0.001);

    }

    @Test
    public void factorial() {
        MainApplication mainApplication = new MainApplication();
        double fact = mainApplication.factorial(3);
        assertEquals(6, fact, 0.001);

    }

    @Test
    public void calculateInverse() {
        InverseFunction Inverse = new InverseFunction();
        double result = Inverse.inverseNumF(4);
        assertEquals(0.25, result, 0.001);

    }

    @Test
    public void calculateInverse1() {
        InverseFunction Inverse = new InverseFunction();
        double result = Inverse.inverseNumF(4);
        assertEquals(0.25, result, 0.001);

    }

    @Test
    public void Logarithmicfunc() {
        MainApplication mainApplication = new MainApplication();
        double logresult = mainApplication.logFunction(10);
        assertEquals(2.302585, logresult, 0.001);

    }
    @Test
    public void Logarithmicfunc10() {
        MainApplication mainApplication = new MainApplication();
        double log10result = mainApplication.logFunction10(10);
        assertEquals(1, log10result, 0.001);
    }

    @Test
    public void inverseLogarithmicfunc() {
        MainApplication mainApplication = new MainApplication();
        double inverselogresult = mainApplication.antiLog(10);
        assertEquals(10, inverselogresult, 0.001);
    }


