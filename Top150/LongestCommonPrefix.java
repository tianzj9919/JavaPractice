class Solution {
    public String longestCommonPrefix(String[] strs){
        int len = strs.length;
        if(len==0) return "";
        String prefix = strs[0];
        for(int i =1;i<len;i++){
            int j =0;
            int limit = Math.min(prefix.length(),strs[i].length());

            while(j<limit && prefix.charAt(j)==strs[i].charAt(j)){
                j++;
            }
            if(j==0) return "";
            prefix = prefix.substring(0,j);
        }
        return prefix;
    }
}
