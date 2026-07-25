// Last updated: 7/25/2026, 2:18:56 PM
1class Solution {
2    public List<Integer> findPeaks(int[] mountain) {
3     List<Integer>a=new ArrayList<>();
4     for(int i=1;i<mountain.length-1;i++){
5        if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
6            a.add(i);
7        }
8     }   
9     return a;
10    }
11}