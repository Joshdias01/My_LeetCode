class Solution {
    public int totalWaviness(int num1, int num2) {
        int wave=0;
        for(int i=num1;i<=num2;i++){
            int n=i;
            ArrayList<Integer> list = new ArrayList<>();
            while(n!=0){
                list.add(n%10);
                n/=10;
            }
            for(int j=1;j<list.size()-1;j++){
                if(list.get(j)>list.get(j-1) && list.get(j)>list.get(j+1)){
                    wave++;
                }else if(list.get(j)<list.get(j-1) && list.get(j)<list.get(j+1)){
                    wave++;
                }
            }
        }
        return wave;
    }
}