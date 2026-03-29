class Solution {
    public int nextGreaterElement(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n!=0){
            list.add(n%10);
            n/=10;
        }
        Collections.reverse(list);
        if(list.size()==1) return -1;
        int idx=-1;
        for(int i=list.size()-2;i>=0;i--){
            if(list.get(i)<list.get(i+1)){
                idx=i;
                break;
            }
        }
        if(idx==-1) return -1;
        int i=0;
        for(i=list.size()-1;i>=0;i--){
            if(list.get(i)>list.get(idx))
                break;
        }
        int ele=list.get(i);
        list.set(i,list.get(idx));
        list.set(idx,ele);
        int nu=list.size()-1;
        idx++;
        while(idx<nu){
            ele=list.get(nu);
            list.set(nu,list.get(idx));
            list.set(idx,ele);
            idx++;nu--;
        }
        long num=0;
        for(i=0;i<list.size();i++){
            num*=10;
            num+=list.get(i);
        }
        return (num < Integer.MIN_VALUE || num > Integer.MAX_VALUE)? -1:(int)num;
    }
}