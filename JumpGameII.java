public class JumpGameII {
    public int jump(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 0;
        for(int i=1; i<nums.length; i++) {
            for(int j=0; j<i; j++) {
                if(j+nums[j]>=i) {
                    result[i] = result[j]+1;
                    break;
                }
            }
        }
        return result[nums.length-1];
    }
}