public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(candidates == null || candidates.length == 0) return result;
        //combination & permutation difference: 能不能往回找 -> 体现在函数里就是有没有start position
        List<Integer> path = new ArrayList<>();
        dfs(candidates, target, result, path, 0);
        return result;
    }
    
    public void dfs(int[] candidates, int target, List<List<Integer>> result, List<Integer> path, int start) {
        if(target == 0) {
            result.add(new ArrayList(path));
            return;
        }
        
        
        for(int i=start; i<candidates.length; i++) {
            if(candidates[i] > target) continue;
            path.add(candidates[i]);
            dfs(candidates, target-candidates[i], result, path, i);
            path.remove(path.size()-1);
        }
    }
}