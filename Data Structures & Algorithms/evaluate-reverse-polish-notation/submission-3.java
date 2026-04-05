class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String ch:tokens){
            if(ch.equals("+")){
                int op1 = stack.pop();
                int op2 = stack.pop();
                stack.push(op1+op2);
            }
            else if(ch.equals("-")){
                int op1 = stack.pop();
                int op2 = stack.pop();
                stack.push(op2-op1);
            }
            else if(ch.equals("*")){
                int op1 = stack.pop();
                int op2 = stack.pop();
                stack.push(op2*op1);
            }
            else if(ch.equals("/")){
                int op1 = stack.pop();
                int op2 = stack.pop();
                stack.push(op2/op1);
            }
            else{
                stack.push(Integer.parseInt(ch));
            }
        }

        return stack.peek();
    }
}