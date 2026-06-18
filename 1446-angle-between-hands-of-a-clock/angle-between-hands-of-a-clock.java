class Solution {
    public double angleClock(int hour, int minutes) {
        double hr=hour*30;
        double min=minutes*6;
        double diff=(double)minutes/2;
        double sum=hr+diff;
        double ans=Math.abs(min-sum);
        return Math.min(ans,360-ans);
    }
}