class Pair{
    String val;
    int idx;
    public Pair(String val,int idx){
        this.val=val;
        this.idx=idx;
    }
}
class TimeMap {
    HashMap<String,List<Pair>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    public void set(String key, String value, int timestamp) {
        Pair p =new Pair(value,timestamp);
        if(!map.containsKey(key)){
            List l=new ArrayList<>();
            map.put(key,l);
        }
        map.get(key).add(p);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        List<Pair> list=map.get(key);
        int low=0;
        int high=list.size()-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(list.get(mid).idx<=timestamp){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(high<0) return "";
        return list.get(high).val;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */