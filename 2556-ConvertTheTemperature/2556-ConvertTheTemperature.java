// Last updated: 5/25/2026, 11:04:19 AM
class Solution {
    public double[] convertTemperature(double c) {
        double[] a=new double[2];
        a[0]=c+273.15;
        a[1]=(c*1.8)+32;
        return a;
    }
}