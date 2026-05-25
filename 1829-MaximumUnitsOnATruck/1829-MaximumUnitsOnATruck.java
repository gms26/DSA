// Last updated: 5/25/2026, 11:05:40 AM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Integer[]ind=new Integer[boxTypes.length];
        for(int i=0;i<boxTypes.length;i++){
            ind[i]=i;
        }
        Arrays.sort(ind,(i,j)->{
            Integer a=boxTypes[i][1];
            Integer b=boxTypes[j][1];
            return Integer.compare(b,a);
        });
        int p=0;
        for(int i:ind){
            if(boxTypes[i][0]<=truckSize){
                p+=boxTypes[i][0]*boxTypes[i][1];
                truckSize-=boxTypes[i][0];

            }
            else{
                p+=boxTypes[i][1]*truckSize;
                truckSize=0;
                break;
            }
        }
        return p;
    }
}