class Solution {
    public int strStr(String haystack, String needle){
        int tlen = haystack.length();
        int plen = needle.length();
        if (plen == 0) return 0;
        if(plen>tlen) return -1;
        for(int i = 0;i<tlen-plen;i++){
            int j =0;
            for(; j<plen;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
                if(j==plen) return i;
            }
        }
        return -1;
    }
}
