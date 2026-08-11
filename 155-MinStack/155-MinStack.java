// Last updated: 8/11/2026, 4:01:23 PM
class MinStack {
        private Stack<Integer> mainStack;
        private Stack<Integer> minStack;
    public MinStack() {
         mainStack = new Stack<>();
         minStack = new Stack<>();
    }
    
    public void push(int val) {
        mainStack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }
        else{
            int cur = minStack.peek();
            minStack.push(Math.min(cur,val));
        }

    }
    
    public void pop() {
        minStack.pop();
        mainStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
         return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */