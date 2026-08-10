// Last updated: 8/10/2026, 12:18:01 PM
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int a[]=arr.clone();
        Arrays.sort(a);
        HashMap<Integer,Integer>h=new HashMap<>();
        int j=1;
        for(int i=0;i<a.length;i++){
            if(!h.containsKey(a[i]))
            h.put(a[i],j++);
        }
        System.out.print(h);
        for(int i=0;i<a.length;i++){
            a[i]=h.get(arr[i]);
        }
        return a;
    }
}