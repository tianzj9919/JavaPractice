import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth){
        List<String> res = new ArrayList<>();
        int n = words.length;
        int i = 0;

        while(i<n){
            int j = i;
            int wordsLen = 0;

            while(j<n){
                int newLen = wordsLen + words[j].length();
                int gaps = j - i;
                if(newLen + gaps > maxWidth) break;
                wordsLen = newLen;
                j++;
            }

            boolean isLastLine = (j==n);
            int numWords = j-i;
            int numGaps = numWords -1;

            StringBuilder sb = new StringBuilder();

            if(numGaps == 0 || isLastLine){
                for(int k = i; k< j; k++){
                    sb.append(words[k]);
                    if(k != j-1) sb.append(' ');
                }

                while (sb.length()< maxWidth) sb.append(' ');
            }else{
                int totalSpaces = maxWidth - wordsLen;
                int base = totalSpaces / numGaps;
                int extra = totalSpaces % numGaps;

                for(int k =i ;k<j; k++){
                    sb.append(words[k]);
                    if(k != j-1){
                        int spaces = base + ((k-i)<extra ? 1 : 0);
                        for(int s =0; s< spaces; s++) sb.append(' ');
                    }
                }
            }

            res.add(sb.toString());
            i=j;
        }
        return res;
    }
}
