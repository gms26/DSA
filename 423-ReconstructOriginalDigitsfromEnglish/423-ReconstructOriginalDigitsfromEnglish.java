// Last updated: 7/25/2026, 3:25:32 PM
1class Solution {
2    public String originalDigits(String s) {
3        HashMap<Character, Integer> a = new HashMap<>();
4        for (char c : s.toCharArray()) {
5            a.put(c, a.getOrDefault(c, 0) + 1);
6        }
7        StringBuilder res = new StringBuilder();
8        String[] s1 = { "zero", "two", "four", "six", "eight", "three", "five", "seven", "one", "nine" };
9        int []d={0,2,4,6,8,3,5,7,1,9};
10        int[] fd=new int[10];
11        for (int i = 0; i < 10; i++) {
12            String z = s1[i];
13            int curr=d[i];
14            while (true) {
15                boolean f1 = false;
16                HashMap<Character,Integer>temp=new HashMap<>();
17                for(char c:z.toCharArray()){
18                    temp.put(c,temp.getOrDefault(c,0)+1);
19                }
20                for (char c : temp.keySet()) {
21                    if (a.getOrDefault(c,0)<temp.get(c)) {
22                        f1 = true;
23                        break;
24                    }
25                }
26                if (f1)
27                    break;
28                fd[curr]++;
29                
30                for (char c : z.toCharArray()) {
31                    if (a.containsKey(c)) {
32                        int x = a.get(c);
33                        if (x <= 1)
34                            a.remove(c);
35                        else
36                            a.put(c, x - 1);
37                    }
38                }
39            }
40        }
41        for(int i=0;i<10;i++){
42            while(fd[i]>0){
43                res.append(i);
44                fd[i]--;
45            }
46        }
47        return res.toString();
48    }
49}