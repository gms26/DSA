// Last updated: 9/28/2026, 10:28:55 PM
class Solution {
    public double[] convertTemperature(double c) {
        double[] a=new double[2];
        a[0]=c+273.15;
        a[1]=(c*1.8)+32;
        return a;
    }
}