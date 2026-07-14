// class Pair{
//     int start;
//     int end;
//     public Pair(int start,int end){
//         this.start=start;
//         this.end=end;
//     }
// }

class MyCalendar {
    public TreeMap<Integer,Integer> map;
    public MyCalendar() {
        map=new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        // Pair p=new Pair(startTime,endTime);
        Integer nextStart=map.ceilingKey(start);
        if (nextStart!=null && nextStart<end) {
            return false; 
        }
        
        Integer prevStart=map.floorKey(start);
        if (prevStart!=null && map.get(prevStart)>start) {
            return false; 
        }
        map.put(start,end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */