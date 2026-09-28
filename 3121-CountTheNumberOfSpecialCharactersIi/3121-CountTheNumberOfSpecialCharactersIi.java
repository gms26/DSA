// Last updated: 9/28/2026, 10:26:25 PM
class Solution {
    public int numberOfSpecialChars(String s) {
        int c=0;
        if(s.indexOf("c")!=-1&& s.indexOf("C")!=-1)
        {
            if(s.indexOf("c")<s.indexOf("C")){
            char a='Z';
            for(int i=a;i>='A';i--){
                 int q=s.indexOf((char)i);
                 int r=s.indexOf(Character.toLowerCase((char)i));
                 int l=s.lastIndexOf(Character.toLowerCase((char)i));
                if(q!=-1 && r!=-1 && r<q && l<q){
                    c++;
                }
            }}
            else{
                
                char a='Z';
            for(int i=a;i>='A';i--){
                int q=s.indexOf((char)i);
                int r=s.indexOf(Character.toLowerCase((char)i));
                int l=s.lastIndexOf(Character.toLowerCase((char)i));
                if(q!=-1 && r!=-1 && r<q && l<q){
                    c++;
                }
            }
        
            }
        }
        else if(s.indexOf("c")==-1&& s.indexOf("C")==-1){
            
                        char a='Z';
            for(int i=a;i>='A';i--){
                int q=s.indexOf((char)i);
                int r=s.indexOf(Character.toLowerCase((char)i));
                int l=s.lastIndexOf(Character.toLowerCase((char)i));

                if(q!=-1 && r!=-1){
                    if(r<q && l<q){
                    c++;
                }
            }
            }

            
        }
        else{
                        char a='Z';
            for(int i=a;i>='A';i--){
                int q=s.indexOf((char)i);
                int r=s.indexOf(Character.toLowerCase((char)i));
                int l=s.lastIndexOf(Character.toLowerCase((char)i));
                if(q!=-1 && r!=-1){
                    if(r<q && l<q){
                    c++;
                }
            }
            }
        }
        return c;
    }}