// Last updated: 10/1/2026, 10:33:54 AM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4        for(int i=0;i<s.length();i++){
5            char ch = s.charAt(i);
6            if(ch=='('||ch=='{'||ch=='['){
7                stack.push(ch);
8            }
9            else{
10                if(stack.isEmpty()) return false;
11                char top = stack.pop();
12                if((ch==')' && top!='(' ||
13                        ch=='}' && top!='{' ||
14                        ch==']' && top!='[')){
15                return false;
16                        }
17            }
18        }
19        return stack.isEmpty();
20    }
21}