public class BinaryWatch {
    public List<String> readBinaryWatch(int num) {
        int[] hours = {1,2,4,8};
        int[] minutes = {1,2,4,8,16,32};
        List<String> result = new ArrayList<>();
        
        for(int i=0; i<=num; i++) {
           List<Integer> hour = dfs(hours, i, 0);
           List<Integer> minute = dfs(minutes, num-i, 0);
           for(int num1:hour) {
               if(num1>11) continue;
               for(int num2:minute) {
                   if(num2>59) continue;
                   result.add(num1 + ":" + (num2 < 10 ? "0" + num2 : num2));
               }
           }
        }
        return result;
    }
    
    List<Integer> dfs(int[] hours, int num, int start) {
        List<Integer> result = new ArrayList<>();
        if(num == 0) {
            result.add(0);
            return result;
        }
        for(int i=start; i<hours.length; i++) {
            List<Integer> sub = dfs(hours, num-1, i+1);
            for(int add:sub) {
                result.add(add+hours[i]);
            }
            
        }
        
        return result;
    }
    
    
}