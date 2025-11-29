class Solution {
    public int romanToInt(String s){
        int len = s.length();
        if(len==0) return 0;
        char[] arr = s.toCharArray();
        int[] val = new int[len];
        int sum =0;

        for(int i =0; i<len;i++){
            switch (arr[i]) {
                case 'I':
                    val[i]= 1;
                    break;
                case 'V':
                    val[i]=5;
                    break;
                case 'X':
                    val[i]= 10;
                    break;
                case 'L':
                    val[i]=50;
                    break;
                case 'C':
                    val[i]=100;
                    break;
                case 'D':
                    val[i]=500;
                    break;
                case 'M':
                    val[i]=1000;
                    break;
                default:
                    return 0;
            }
        }
        if(len ==1) return val[0];
        for(int i=1;i<len;i++){
            if(val[i]>val[i-1]){
                sum -=val[i-1];
            }else{
                sum +=val[i-1];
            }
        }

        return sum + val[len-1];
    }
}
