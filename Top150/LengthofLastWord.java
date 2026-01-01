class Solution {
    public int lengthOfLastWord(String s){
        int len = s.length();
        int cur = len -1;
        int res = 0;

        while(cur>-1 && s.charAt(cur) ==' '){
            cur--;
        }

        while(cur>-1 && s.charAt(cur) !=' '){
            res++;
            cur--;
        }

        return res;
    }
}
