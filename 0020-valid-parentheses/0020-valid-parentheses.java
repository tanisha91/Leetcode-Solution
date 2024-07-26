class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        int i=0;
        while(i<s.length()){
            if(st.isEmpty()){
                st.push(s.charAt(i++));
            }
            else{
                char ch=s.charAt(i++);
                if(ch=='[' || ch=='(' || ch=='{'){
                   st.push(ch);
                }
                else if(ch==']' && st.peek()=='['){
                    st.pop();
                }
                else if(ch==')' && st.peek()=='('){
                    st.pop();
                }
                else if(ch=='}' && st.peek()=='{'){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        return st.isEmpty();
    }
}