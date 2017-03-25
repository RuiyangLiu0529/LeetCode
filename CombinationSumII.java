public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(candidates == null || candidates.length == 0) return result;
        Arrays.sort(candidates);
        //candidates = removeDuplicate(candidates);
        List<Integer> path = new ArrayList<>();
        dfs(candidates, target, result, path, 0);
        return result;
    }
    void dfs(int[] candidates, int target, List<List<Integer>> result, List<Integer> path, int start) {
        if(target == 0) {
            result.add(new ArrayList(path));
            return;
        }
        
        for(int i=start; i<candidates.length; i++) {
            if(candidates[i] > target) continue;
            if(i!=start && candidates[i] == candidates[i-1]) continue;
            path.add(candidates[i]);
            dfs(candidates, target-candidates[i], result, path, i+1);
            path.remove(path.size()-1);
        }
    }
    int[] removeDuplicate(int[] nums) {
        int i = -1;
        int j = 0;
        while(j < nums.length) {
            if(j==0 || nums[j]!= nums[j-1]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        
        int[] newNums = new int[i+1];
        for(int index=0; index<=i; index++) {
            newNums[index] = nums[index];
        }
        return newNums;
    }
}