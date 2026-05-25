// Last updated: 5/25/2026, 11:04:24 AM
class Solution {
    public String[] sortPeople(String[] names, int[] b) {
        int n=b.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(b[j]<b[j+1]){
                    int c=b[j];
                    b[j]=b[j+1];
                    b[j+1]=c;
                    String s=names[j];
                    names[j]=names[j+1];
                    names[j+1]=s;
                }
            }
        }
        return names;
    }
}