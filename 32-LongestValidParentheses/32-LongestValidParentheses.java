// Last updated: 8/11/2026, 4:01:56 PM
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        char ch[] = s.toCharArray();
        int max=0;
        stack.push(-1);
        for(int i=0;i<ch.length;i++){
          if(ch[i]=='('){
            stack.push(i);
          }  
          else{
            stack.pop();
            if(stack.isEmpty()){
                stack.push(i);
            }
            else{
                int cur = i-stack.peek();
                max=Math.max(cur,max);
            }
          }

        }  
           return max;
        
    }
}