// Last updated: 7/13/2026, 12:16:52 AM
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime) {
3        String[] st= startTime.split(":");
4        String[] ed= endTime.split(":");
5
6        int ss=Integer.parseInt(st[0])*3600+Integer.parseInt(st[1])*60+Integer.parseInt(st[2]);
7        int es=Integer.parseInt(ed[0])*3600+Integer.parseInt(ed[1])*60+Integer.parseInt(ed[2]);
8        return es-ss;
9    }
10}