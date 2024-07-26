class MinStack {
Stack<pair>st;
   
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
         int mini;
        if(st.isEmpty()){
            mini=val;
        }
        else{
            mini=Math.min(st.peek().y,val);
        }
        st.push(new pair(val,mini));
        
    }
    
    public void pop() {
        // if(st.isEmpty()) return -1;
        st.pop();
       // int bn= st.pop().y;
        // return val;
    }
    
    public int top() {
        int val=st.peek().x;
        return val;
    }
    
    public int getMin() {
        return st.peek().y;
    }
}
class pair{
    int x;
    int y;
    pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */