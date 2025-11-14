import java.util.PriorityQueue;
class Solution{
public int hIndex(int[] citations) {
    int res=0;
    int len=citations.length;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for(int i =0;i<len;i++){
        if(citations[i]>=res){
            minHeap.add(citations[i]);
            if(minHeap.size()>=minHeap.peek()){
                res = minHeap.poll();
            }
            if (minHeap.size()>res) {
                res++;
            }
        }
    }
    return res;
}
}