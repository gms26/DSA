// Last updated: 7/24/2026, 6:06:27 PM
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] st= startTime.split(":");
        String[] ed= endTime.split(":");

        int ss=Integer.parseInt(st[0])*3600+Integer.parseInt(st[1])*60+Integer.parseInt(st[2]);
        int es=Integer.parseInt(ed[0])*3600+Integer.parseInt(ed[1])*60+Integer.parseInt(ed[2]);
        return es-ss;
    }
}