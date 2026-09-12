// Last updated: 9/12/2026, 2:13:10 PM
1class Solution {
2
3    List<List<Integer>> res;
4    public List<List<Integer>> combinationSum(int[] candidates, int target) {
5        res = new ArrayList<>();
6
7        bt(candidates , target, 0 ,new ArrayList<>(), 0);
8        return res;
9    }
10
11
12    public void bt(int[] arr , int tar , int curr , ArrayList<Integer> lst , int i ){
13            if(i>=arr.length){
14                return;
15    }
16
17    if(curr >= tar){if(curr==tar)
18        res.add(new ArrayList<>(lst));
19        return;
20    }
21    curr+=arr[i];
22        lst.add(arr[i]);
23bt(arr,tar,curr,lst,i);
24curr-=arr[i];
25lst.remove(lst.size()-1);
26bt(arr,tar,curr,lst,i+1);
27    }
28
29}