public class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> minStack;
    Stack<Integer> min;
    public MinStack() {
        minStack = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int x) {
        minStack.push(x);
        if(min.isEmpty() || min.peek() >= x) {
            min.push(x);
        }
    }
    
    //.equals to compare object value can not use == here
    public void pop() {
        if(min.peek().equals(minStack.peek()) ) {
            min.pop();
        }
        minStack.pop();
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */