class Solution {
    public String alphabetBoardPath(String target) {
        HashMap<Character,List<Integer>> map = new HashMap<>();
        int p=0,j=0;
        for(int i=97;i<123;i++){
            List a=new ArrayList<>();
            if(j==5){
                p++;
                j=0;
            }
            a.add(p);
            a.add(j);
            map.put((char)i,a);
            j++;            
        }
        //System.out.println(map);
        StringBuilder s = new StringBuilder();
        int c=0,r=0;
        for(int i=0;i<target.length();i++){
            int tRow=map.get(target.charAt(i)).get(0);
            int tCol=map.get(target.charAt(i)).get(1);
            if(tCol<c){
                while(c!=tCol){
                    s.append("L");
                    c--;
                }
            }
            if(tRow<r){
                while(r!=tRow){
                    s.append("U");
                    r--;
                }
            }
            if(tCol>=c){
                while(c!=tCol){
                    s.append("R");
                    c++;
                }
            }
            if(tRow>=r){
                while(r!=tRow){
                    s.append("D");
                    r++;
                }
            }
            s.append("!");
        }
        return s.toString();
    }
}