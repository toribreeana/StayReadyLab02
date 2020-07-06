package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigFunctionsTest {

    @Test
    public void sineTest() {
        // Given 
        TrigFunctions trigFeatures = new TrigFunctions();
        double expected = 0.9092974268256817;

        // When 
        SciCalc.currentValue = 2.0;
        double actual = trigFeatures.sine();

        // Then 
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void cosineTest() {
        // Given 
        TrigFunctions trigFeatures = new TrigFunctions();
        double expected = -0.4161468365471424;

        // When 
        SciCalc.currentValue = 2.0;
        double actual = trigFeatures.cosine();

        // Then 
        Assert.assertEquals(expected, actual, 0.0);
    }
    
    @Test
    public void tangentTest() {
        // Given 
        TrigFunctions trigFeatures = new TrigFunctions();
        double expected = -2.185039863261519;

        // When 
        SciCalc.currentValue = 2.0;
        double actual = trigFeatures.tangent();

        // Then 
        Assert.assertEquals(expected, actual, 0.0);
    }
    
    @Test
    public void inverseSine() {
        // Given 
        TrigFunctions trigFeatures = new TrigFunctions();
        double expected = 1.1415926535897933;

        // When 
        SciCalc.currentValue = 0.9092974268256817;
        double actual = trigFeatures.inverseSine();

        // Then 
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void inverseCosineTest() {
        // Given 
        TrigFunctions trigFeatures = new TrigFunctions();
        double expected = 2.0;

        // When 
        SciCalc.currentValue = -0.4161468365471424;
        double actual = trigFeatures.inverseCosine();

        // Then 
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void inverseTangentTest() {
        // Given 
        TrigFunctions trigFeatures = new TrigFunctions();
        double expected = 1.1071487177940904;

        // When 
        SciCalc.currentValue = 2.0;
        double actual = trigFeatures.inverseTangent();

        // Then 
        Assert.assertEquals(expected, actual, 0.0);
    }
}