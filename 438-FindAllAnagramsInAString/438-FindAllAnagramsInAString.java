// Last updated: 5/25/2026, 11:09:37 AM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>r=new ArrayList<>();
        if(s.length()<p.length())return r;
        int []a=new int[26];
        for(char c:p.toCharArray()){
            a[c-'a']++;
        }
        int left=0,right=0;
        while(right<s.length()){
            a[s.charAt(right)-'a']--;
            right++;
            if(right-left==p.length()){
                if(check(a)){
                    r.add(left);
                }
                a[s.charAt(left)-'a']++;
                left++;
            }
        }
        return r;
    }
    boolean check(int[] m){
        for(int i:m){
            if(i!=0)return false;
        }
        return true;
    }
}