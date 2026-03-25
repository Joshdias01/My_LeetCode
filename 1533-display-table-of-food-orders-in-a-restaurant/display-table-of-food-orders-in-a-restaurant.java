class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> res = new ArrayList<>();
        TreeSet<String> set = new TreeSet<>(); // unique item
        TreeMap<Integer,Map<String,Integer>> map = new TreeMap<>(); //table->(item->count)
        
        for(List s:orders){
            set.add(s.get(2).toString());
            if(!map.containsKey(Integer.valueOf(s.get(1).toString()))){
                Map<String,Integer> mp= new HashMap<>();
                map.put(Integer.valueOf(s.get(1).toString()),mp);
            }
            Map<String,Integer> mp=map.get(Integer.valueOf(s.get(1).toString()));
            mp.put(s.get(2).toString(),mp.getOrDefault(s.get(2).toString(),0)+1);
        }

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Table");
        for(String s:set)
            arr.add(s);
        res.add(arr);

        // for(String s:table){
        //     arr=new ArrayList<>();
        //     arr.add(s);
        //     for(int i=0;i<set.size();i++){
        //         arr.add("0");
        //     }
        //     res.add(arr);
        // }
        // for(List s:orders){
        //     arr=new ArrayList<>();
        //     arr.add()
        // }
        for(Map.Entry<Integer,Map<String,Integer>> entry : map.entrySet()){
            arr=new ArrayList<>();
            arr.add(entry.getKey().toString());
            Map<String,Integer> mp = entry.getValue();
            for(String s:res.get(0)){
                if(mp.containsKey(s)){
                    arr.add(mp.get(s).toString());
                }
                else
                    arr.add("0");
            }
            // System.out.print(arr);
            arr.remove(1); // i should remove that one unnecessary no;
            res.add(arr);
        }
        return res;
    }
}