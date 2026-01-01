class Solution {
    public boolean isSubsequence(String s, String t){
        int sLen = s.length();
        int tLen = t.length();
        if(sLen>tLen) return false;
        if(sLen==0) return true;

        int i = 0;
        int cur = 0;

        while(cur<tLen){
            if(t.charAt(cur)== s.charAt(i)){
                i++;
            }
            cur++;

            if(i==sLen) return true;
        }

        return false;
    }
}
