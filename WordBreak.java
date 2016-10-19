public class WordBreak {
    public boolean wordBreak(String s, Set<String> wordDict) {
        if(s == null || s.length() == 0) {
            return false;
        }
        boolean[] result = new boolean[s.length()+1];
        result[0] = true;
        
        for(int i=1; i<=s.length(); i++) {
            for(int j=0; j<i; j++) {
                if(result[j] && wordDict.contains(s.substring(j,i))) result[i] = true;
            }
        }
        return result[s.length()];
        
    }
}