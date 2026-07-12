class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] start=startTime.split(":");
        String[] end=endTime.split(":");

        return (Integer.parseInt(end[0])-Integer.parseInt(start[0]))*3600 + (Integer.parseInt(end[1])-Integer.parseInt(start[1]))*60 + (Integer.parseInt(end[2])-Integer.parseInt(start[2]));
    }
}