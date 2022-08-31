class Solution {
    private int getNext(int n) {
        int Sum=0;
        while (n>0) {
            int d = n%10;
            Sum += d*d;
            n = n/10;
        }
        return Sum;
    }
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n!=1 && !set.contains(n)) {
            set.add(n);
            n = getNext(n);
        }
        return n==1;
    }
}
