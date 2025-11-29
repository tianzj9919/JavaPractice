import java.util.LinkedList;
import java.util.Deque;

class Sulotion {
    public int trap(int[] height){
        int len = height.length;
        int[] plus = new int[len+1];

        for(int i=0; i<len;i++){
            plus[i]=height[i];
        }
        Deque<Integer> stack = new LinkedList<>();
        int sum =0;
        
        for(int i=0;i<len+1;i++){
            while(!stack.isEmpty() && plus[stack.peek()]<plus[i]){
                int cur = stack.pop();
                if(!stack.isEmpty()){
                    int w = i - stack.peek() -1;
                    int h = Math.min(plus[i],plus[stack.peek()])-plus[cur];
                    sum += w*h;
                }
            }
            stack.push(i);
        }

        return sum;
    }
}
