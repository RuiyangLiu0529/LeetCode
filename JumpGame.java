//O(n^2) leet can not pass 
public class JumpGame{
    public boolean canJump(int[] nums) {
        boolean[] result =new boolean[nums.length];
        result[0] = true;
        for(int i=1; i<nums.length; i++) {
            for(int j=0; j<i; j++) {
                if(result[j] && (j+nums[j] >= i)) {
                    result[i] = true;
                    break;
                }
            }
        }
        return result[nums.length-1];
    }
}
//O(n)
public class JumpGame1 {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i=0; i< nums.length; i++) {
            if(i > max) return false;
            max = Math.max(max,nums[i]+i);
        }
        return true;
    }
}