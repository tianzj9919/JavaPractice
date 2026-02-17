import java.util.*;

class Solution {
    static class Edge{
        String to;
        double w;
        Edge(String to,double w){ this.to = to; this.w = w;}
    }
    public double[] calcEquation(List<List<String>> equations,double[] values, List<List<String>> queries){
        Map<String, List<Edge>> g = new HashMap<>();

        for(int i =0; i<equations.size();i++){
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            double k = values[i];

            g.computeIfAbsent(a,x -> new ArrayList<>()).add(new Edge(b,k));
            g.computeIfAbsent(b, x-> new ArrayList<>()).add(new Edge(a,1.0/k));
        }

        double[] ans = new double[queries.size()];
        for(int i =0; i<queries.size();i++){
            String x = queries.get(i).get(0);
            String y = queries.get(i).get(1);

            if(!g.containsKey(x) || !g.containsKey(y)){
                ans[i] = -1.0;
            }else if(x.equals(y)){
                ans[i] = 1.0;
            }else{
                ans[i] = dfs(x,y,1.0,g,new HashSet<>());
            }
        }
        return ans;
    }

    private double dfs(String cur, String target, double acc, Map<String,List<Edge>> g, Set<String> vis){
        if(cur.equals(target)) return acc;
        vis.add(cur);

        for(Edge e : g.get(cur)){
            if(vis.contains(e.to)) continue;
            double res = dfs(e.to,target,acc*e.w,g,vis);
            if(res != -1.0) return res;
        }
        return -1.0;
    }
}
