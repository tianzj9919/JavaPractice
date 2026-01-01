import java.util.ArrayList;
import java.util.List;

class Solution {
    public String intToRoman (int num) {
        if(num ==0) return "";
        List<Character> list = new ArrayList<>();
        while (num!= 0) {
            if(num>=1000){
                list.add('M');
                num-=1000;
            }else if(num>=900){
                list.add('C');
                num+=100;
            }else if(num>=500){
                list.add('D');
                num-=500;
            }else if(num>=400){
                list.add('C');
                num+=100;
            }else if(num>=100){
                list.add('C');
                num-=100;
            }else if(num>=90){
                list.add('X');
                num+=10;
            }else if(num>=50){
                list.add('L');
                num-=50;
            }else if(num>=40){
                list.add('X');
                num+=10;
            }else if(num>=10){
                list.add('X');
                num-=10;
            }else if(num==9){
                list.add('I');
                list.add('X');
                num=0;
            }else if(num>=5){
                list.add('V');
                num-=5;
            }else if(num==4){
                list.add('I');
                list.add('V');
                num=0;
            }else{
                for(int i=0;i<num;i++){
                    list.add('I');
                }
                num=0;
            }
        }

        StringBuilder ans = new StringBuilder();
        for(char c : list){
            ans.append(c);
        }
        String res = ans.toString();

        return res;
    }
    /*
    public String intToRoman(int num) {
        int[] values =    {1000, 900, 500, 400, 100, 90,  50,  40,  10,  9,   5,  4,  1};
        String[] romans = {"M",  "CM","D", "CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                sb.append(romans[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }
    */ 
}
