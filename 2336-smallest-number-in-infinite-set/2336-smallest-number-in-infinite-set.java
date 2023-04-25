class SmallestInfiniteSet {
private Set<Integer>set;
    public SmallestInfiniteSet() {
        set=new HashSet<>();
        for(int i=1;i<=1000;i++){
            set.add(i);
        }
    }
    
    public int popSmallest() {
        int small=0;
        for(int num:set){
            small=num;
            set.remove(num);
            break;
        }
        return small;
    }
    
    public void addBack(int num) {
        if(!set.contains(num)){
            set.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */