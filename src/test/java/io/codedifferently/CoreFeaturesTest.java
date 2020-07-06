package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class CoreFeaturesTest {

    @Test
    public void addTest(){
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 4.0; 

        // When 
        SciCalc.currentValue = 2.0;
        double actual = coreFeatures.add(2.0);
        
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

@Test 
public void subtractTest(){
        // Given 
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 4.0;

        // When 
        SciCalc.currentValue = 2.0;
        double actual = coreFeatures.subtract(2.0);
        
        // Then 
        Assert.assertEquals(expected, actual, 0.0);
    }

@Test
public void divideTest(){
        // Given 
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 4.0;

        // When 
        SciCalc.currentValue = 2.0;
        double actual = coreFeatures.divide(2.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void multiplyTest(){
        // Given 
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 4.0;

        // When 
        SciCalc.currentValue = 2.0;
        double actual = coreFeatures.multiply(2.0);

        // Then 
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test 
    public void squareTest(){
         // Given 
         CoreFeatures coreFeatures = new CoreFeatures();
         double expected = 4.0;
 
         // When 
         SciCalc.currentValue = 2.0;
         double actual = coreFeatures.square(2.0);
 
         //Then 
         Assert.assertEquals(expected, actual, 0.0);
    }
        
    @Test
    public void squareRootTest(){
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 4.0;
        
        // When 
        SciCalc.currentValue = 2.0;
        double actual = coreFeatures.squareRoot(2.0);

        // Then 
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void exponentiationTest(){
        // Given 
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 4.0;

        // When 
        SciCalc.currentValue = 2.0;
        double actual = coreFeatures.exponentiation(2.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void inverseTest(){
        // Given 
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 4.0;

        // When 
        SciCalc.currentValue = 2.0;
        double actual = coreFeatures.inverse(2.0);

        // Then 
        Assert.assertEquals(expected, actual, 0.0);

    }
    @Test 
    public void invertSignTest(){
        // Given 
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 4.0;

        // When 
        SciCalc.currentValue = 2.0;
        double actual = coreFeatures.invertSign(2.0);

        // Then 
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test 
    public void factorialTest(){
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 4.0;

        // When 
        SciCalc.currentValue = 2.0;
        double actual = coreFeatures.factorial(2.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0); 
    }

    @Test 
    public void switchSignTest(){
        // Given 
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 4.0;

        // When 
        SciCalc.currentValue = 2.0;
        double actual = coreFeatures.switchSign(2.0);

        // Then 
        Assert.assertEquals(expected, actual,0.0);
    }




}


    