import java.util.*;

class Solution {
    private Map<Node,Node> map = new HashMap<>();

    public Node cloneGraph(Node node){
        if(node == null) return null;
        return dfs(node);
    }

    private Node dfs(Node cur){
        if(map.containsKey(cur)) return map.get(cur);

        Node copy = new Node(cur.val);
        map.put(cur,copy);

        for(Node nei : cur.neighbors){
            copy.neighbors.add(dfs(nei));
        }
        return copy;
    }
}
