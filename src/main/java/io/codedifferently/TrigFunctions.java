package io.codedifferently;

public class TrigFunctions {
    public double sine() {
        return Math.sin(SciCalc.currentValue);
    }
    public double cosine() {
        return Math.cos(SciCalc.currentValue);
    }
    public double tangent() {
        return Math.tan(SciCalc.currentValue);
    }
    public double inverseSine() {
        return Math.asin(SciCalc.currentValue);
    }
    public double inverseCosine() {
        return Math.acos(SciCalc.currentValue);
    }
    public double inverseTangent() {
        return Math.atan(SciCalc.currentValue);
    }

}