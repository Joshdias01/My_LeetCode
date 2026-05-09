class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0,counter=0,i=0;

        while(i!=events.length && counter!=10){
            if(events[i].equals("W"))
                counter++;
            else if(events[i].equals("WD"))
                score++;
            else if(events[i].equals("NB"))
                score++;
            else {
                score=score+Integer.parseInt(events[i]);
            }
            i++;
        }
        return new int[]{score,counter};
    }
}