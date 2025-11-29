import java.util.*;

class RandomizedSet{
    private List<Integer> list;
    private Map<Integer, Integer> map;
    private Random rand;

    public RandomizedSet(){
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }

    public boolean insert(int val){
        if(map.containsKey(val)){
            return false;
        }
        list.add(val);
        map.put(val,list.size()-1);
        return true;
    }

    public boolean remove(int val){
        if(!map.containsKey(val)){
            return false;
        }
        int idx = map.get(val);
        int lastVal = list.get(list.size()-1);
        list.set(idx,lastVal);
        map.put(lastVal,idx);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }

    public int getRandom(){
        int idx = rand.nextInt(list.size());
        return list.get(idx);
    }
}