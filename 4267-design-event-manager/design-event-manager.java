class EventManager {
    int[][] events;
    HashMap<Integer,Integer> map = new HashMap<>();
    TreeMap<Integer,TreeSet<Integer>> p = new TreeMap<>();
    public EventManager(int[][] events) {
        this.events=events;
        for(int i=0;i<events.length;i++){
            map.put(events[i][0],i);
            if(!p.containsKey(events[i][1])){
                p.put(events[i][1],new TreeSet<Integer>());
            }
            p.get(events[i][1]).add(events[i][0]);
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        if (!map.containsKey(eventId)) return;
        int i=getIndex(eventId);
        p.get(events[i][1]).remove(eventId);
        if (p.get(events[i][1]).size()==0) {
            p.remove(events[i][1]);
        }
        if(!p.containsKey(newPriority)){
            p.put(newPriority,new TreeSet<Integer>());
        }
        p.get(newPriority).add(events[i][0]);
        events[i][1]=newPriority;
    }
    
    public int pollHighest() {
        if(p.size()==0) return -1;
        int max=p.lastKey();
        int get=p.get(max).pollFirst();
        if(p.get(max).size()==0)
            p.remove(max);
        map.remove(get);
        return get;
    }
    public int getIndex(int eventId){
        return map.get(eventId);
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */