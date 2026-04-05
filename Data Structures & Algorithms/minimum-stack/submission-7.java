class MinStack {
    Stack<Integer> stack;
    Deque<Integer> deque;

    public MinStack() {
        stack = new Stack<>();
        deque = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(deque.isEmpty() || val<=deque.getLast()) deque.addLast(val);
    }
    
    public void pop() {
        int val = stack.peek();
        stack.pop();
        if(val==deque.getLast()) deque.pollLast();

    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return deque.getLast();
    }
}
