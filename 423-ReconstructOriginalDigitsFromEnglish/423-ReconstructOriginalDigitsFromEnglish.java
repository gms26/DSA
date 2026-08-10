// Last updated: 8/10/2026, 12:22:53 PM
class Solution {
    public String originalDigits(String s) {
        HashMap<Character, Integer> a = new HashMap<>();
        for (char c : s.toCharArray()) {
            a.put(c, a.getOrDefault(c, 0) + 1);
        }
        StringBuilder res = new StringBuilder();
        String[] s1 = { "zero", "two", "four", "six", "eight", "three", "five", "seven", "one", "nine" };
        int []d={0,2,4,6,8,3,5,7,1,9};
        int[] fd=new int[10];
        for (int i = 0; i < 10; i++) {
            String z = s1[i];
            int curr=d[i];
            while (true) {
                boolean f1 = false;
                HashMap<Character,Integer>temp=new HashMap<>();
                for(char c:z.toCharArray()){
                    temp.put(c,temp.getOrDefault(c,0)+1);
                }
                for (char c : temp.keySet()) {
                    if (a.getOrDefault(c,0)<temp.get(c)) {
                        f1 = true;
                        break;
                    }
                }
                if (f1)
                    break;
                fd[curr]++;
                
                for (char c : z.toCharArray()) {
                    if (a.containsKey(c)) {
                        int x = a.get(c);
                        if (x <= 1)
                            a.remove(c);
                        else
                            a.put(c, x - 1);
                    }
                }
            }
        }
        for(int i=0;i<10;i++){
            while(fd[i]>0){
                res.append(i);
                fd[i]--;
            }
        }
        return res.toString();
    }
}