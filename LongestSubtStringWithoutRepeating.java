public class LongestSubStringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        if(s == "" || s.length() == 0) {
            return 0;
        }
        
        HashSet<Character> hash = new HashSet<>();
        int left = 0;
        int right = 0;
        hash.add(s.charAt(0));
        int maxLength = Integer.MIN_VALUE;
       
        while(right < s.length()) {
            if(hash.contains(s.charAt(right))) {
                maxLength = Math.max(right-left, maxLength);
                while(left < right && hash.contains(s.charAt(right))) {
                    hash.remove(s.charAt(left));
                    left++;
                }
                hash.add(s.charAt(right));
            }else {
                hash.add(s.charAt(right));
            }
            right++;
        }
        maxLength = Math.max(right-left, maxLength);
        return maxLength;
    }
}