//这种加数 出来一个数的结构首先想到用栈 根据经验这种动态的应该用两个栈
//然后发现中位数就是分成两组数 一组出一个最大的数 一组出一个最小的数 
//注意每次放到minstack里的不是num而是包括num在内的max stack里的最大的数 比如 add 1 add －2 add－3 这时候要放1到min里而不是－3



public class MedianFinder {
    
    Queue<Integer> min = new PriorityQueue<>();
    Queue<Integer> max = new PriorityQueue<Integer>(Collections.reverseOrder());
    // Adds a number into the data structure.
    public void addNum(int num) {
        max.add(num);
        min.add(max.poll());
        if(max.size() < min.size()){
            max.add(min.poll());
        }
    }

    // Returns the median of current data stream
    public double findMedian() {
        if(max.size() == min.size()) {
            return ((double)max.peek()+(double)min.peek())/2;
        }else {
            return max.peek();
        }
    }
};

// Your MedianFinder object will be instantiated and called as such:
// MedianFinder mf = new MedianFinder();
// mf.addNum(1);
// mf.findMedian();