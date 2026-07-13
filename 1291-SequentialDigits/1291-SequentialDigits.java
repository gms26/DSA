// Last updated: 7/13/2026, 12:22:27 PM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        int a[]=arr.clone();
4        Arrays.sort(a);
5        HashMap<Integer,Integer>h=new HashMap<>();
6        int j=1;
7        for(int i=0;i<a.length;i++){
8            if(!h.containsKey(a[i]))
9            h.put(a[i],j++);
10        }
11        System.out.print(h);
12        for(int i=0;i<a.length;i++){
13            a[i]=h.get(arr[i]);
14        }
15        return a;
16    }
17}