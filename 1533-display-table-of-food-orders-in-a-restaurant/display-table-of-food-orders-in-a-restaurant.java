class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> res = new ArrayList<>();
        TreeSet<String> set = new TreeSet<>();
        TreeMap<Integer,Map<String,Integer>> map = new TreeMap<>();
        
        for(List s:orders){
            set.add(s.get(2).toString());
            if(!map.containsKey(Integer.valueOf(s.get(1).toString()))){
                Map<String,Integer> mp= new HashMap<>();
                map.put(Integer.valueOf(s.get(1).toString()),mp);
            }
            Map<String,Integer> mp=map.get(Integer.valueOf(s.get(1).toString()));
            mp.put(s.get(2).toString(),mp.getOrDefault(s.get(2).toString(),0)+1);
        }
        System.out.println(map);
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Table");
        for(String s:set)
            arr.add(s);
        res.add(arr);

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
            arr.remove(1);
            res.add(arr);
        }
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
        return res;
    }
}