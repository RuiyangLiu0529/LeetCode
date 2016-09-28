/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
// 用一个数组去和另一个数组比较，有重合部分更新，不重合加入result；
// 判断重合的时候先固定start 然后比较end
public class MergeInterval {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<>();
        if(intervals == null || intervals.size() == 0) {
            return result;
        }
        Collections.sort(intervals, new IntervalComparator());
        Interval interval = intervals.get(0);
        for(int i=1; i<intervals.size(); i++) {
            Interval next = intervals.get(i);
            if(interval.end < next.start) {
                result.add(interval);
                interval = next;
            }
            if(interval.end >= next.start) {
                interval.end = Math.max(next.end, interval.end);
            }
        }
        result.add(interval);
        return result;
    }
    private class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval interval1, Interval interval2) {
            return interval1.start - interval2.start;
        }
    }
    
}