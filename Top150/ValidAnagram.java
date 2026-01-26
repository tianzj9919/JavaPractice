class Solution {
    public boolean isAnagram(String s, String t){
        int m = s.length();
        int n = t.length();
        if(m!=n) return false;

        int[] letters = new int[26];

        for(int i=0; i< m ; i++){
            char c = s.charAt(i);
            letters[c-'a']++;
        }

        for(int i =0; i<n;i++){
            char c = t.charAt(i);
            if(letters[c-'a']==0) return false;
            letters[c-'a']--;
        }

        return true;
    }
}
