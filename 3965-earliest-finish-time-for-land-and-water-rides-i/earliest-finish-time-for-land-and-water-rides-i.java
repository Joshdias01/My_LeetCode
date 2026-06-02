class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int[][] land=new int[landStartTime.length][2];
        int[][] water = new int[waterStartTime.length][2];

        for(int i=0;i<landStartTime.length;i++){
            land[i][0]=landStartTime[i];
            land[i][1]=landDuration[i];
        }
        for(int i=0;i<waterStartTime.length;i++){
            water[i][0]=waterStartTime[i];
            water[i][1]=waterDuration[i];
        }

        Arrays.sort(land,(a,b)-> a[0]-b[0]);
        Arrays.sort(water,(a,b)-> a[0]-b[0]);
        int min=Integer.MAX_VALUE;
        for (int i=0;i<land.length;i++) {
            for (int j=0;j<water.length;j++) {
                int countLand=0;
                countLand+=land[i][0]+land[i][1];
                if (water[j][0]<=countLand) {
                    countLand+=water[j][1];
                }else{
                    countLand+=(water[j][0]-countLand);
                    countLand+=water[j][1];
                }
                int countWater=0;
                countWater+=water[j][0]+water[j][1];
                if (land[i][0]<=countWater) {
                    countWater+=land[i][1];
                }else{
                    countWater+=(land[i][0]-countWater);
                    countWater+=land[i][1];
                }
                int currentMin=Math.min(countWater,countLand);
                min=Math.min(min,currentMin);
            }
        }
        return min;
    }
}