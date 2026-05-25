// Last updated: 5/25/2026, 11:13:41 AM
class Solution {
    public int romanToInt(String s) {
        int b=0;
        int a=0;
        for(int i=s.length()-1;i>=0;i--){
            int n=0;
            //System.out.println("i: "+" -char:"+s.charAt(i));
            switch(s.charAt(i)){
                case 'I':
                n+=1;break;
                case 'V':
                n+=5;break;
                case 'X':
                n+=10;break;
                case 'L':
                n+=50;break;
                case 'C':
                n+=100;break;
                case 'D':
                n+=500;break;
                case 'M':
                n=1000;break;
            }
        
        
        if(4*n<b){
            a-=n;}
        else{
            a+=n;
        }
        b=n;
        }
        return a;
    }
}