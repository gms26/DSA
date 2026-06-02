// Last updated: 6/2/2026, 12:30:26 PM
1class Solution {
2    public String removeDigit(String number, char digit) {
3         String maxResult = ""; 
4
5        for (int i = 0; i < number.length(); i++) {
6            if (number.charAt(i) == digit) {
7                String candidate = number.substring(0, i) + number.substring(i + 1);
8
9                if (candidate.compareTo(maxResult) > 0) {
10                    maxResult = candidate; 
11                }
12            }
13        }
14
15        return maxResult;
16    }
17}