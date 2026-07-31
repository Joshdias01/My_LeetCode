class TopVotedCandidate {
    int[] leaders;
    int[] times;
    public TopVotedCandidate(int[] persons, int[] times) {
        this.leaders=new int[persons.length];
        this.times=times;

        Map<Integer, Integer> voteCounts = new HashMap<>();
        int currentLeader = -1;
        int maxVotes = 0;
        
        for (int i = 0; i < persons.length; i++) {
            int person = persons[i];
            int count = voteCounts.getOrDefault(person, 0) + 1;
            voteCounts.put(person, count);
            
            // If this candidate has >= votes than the current leader,
            // they become the new leader (resolves ties by recency)
            if (count >= maxVotes) {
                currentLeader = person;
                maxVotes = count;
            }
            leaders[i] = currentLeader;
        }
    }
    
    public int q(int t) {
        int low=0,high=times.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(times[mid]>=t){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(low<0) return leaders[0];
        if(low>=times.length) return leaders[leaders.length-1];
        return (t==times[low])? leaders[low]:leaders[low-1];
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */