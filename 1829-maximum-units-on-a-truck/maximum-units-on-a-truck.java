class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)-> b[1]-a[1]);
        int count=0;
        for(int i=0;i<boxTypes.length && truckSize>=0;i++){
            if(truckSize>=boxTypes[i][0]){
                count+=boxTypes[i][0]*boxTypes[i][1];
                truckSize-=boxTypes[i][0];
            }
            else{
                count+=truckSize*boxTypes[i][1];
                truckSize=0;
            }
        }
        return count;
    }
}