//能想到的方法最直接的就是hashmap 一个循环里面用if判断

public class  MajorityElement {
    public int majorityElement(int[] nums) {
       int count = 0;
       int candidate = -1;
       
       for(int num:nums) {
           if(count == 0) {
               count++;
               candidate = num;
           }else if(candidate == num) {
               count++;
           }else {
               count--;
           }
       }
       
       return candidate;
    }
}   