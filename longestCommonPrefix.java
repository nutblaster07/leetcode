class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.length()==0){
                    return "";
                }
            }
        }
        return prefix;
    }
}

class Main{
    public static void main(String args[]){
        Solution s= new Solution();
        String strs[] = {"flower","flow","flight"};
        String res=s.longestCommonPrefix(strs);
        System.out.println(res);
        //System.out.println(str.substring(0,2));
        
    }
}