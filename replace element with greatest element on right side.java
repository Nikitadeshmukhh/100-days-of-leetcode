class Solution {
    public int[] replaceElements(int[] arr) {
        int tmp = -1;
        int N = arr.length-1;
        for (int i = N; i >= 0; i--) {
            int next = Math.max(arr[i],tmp);
            arr[i] = tmp;
            tmp = next;
        }
        return arr;
    }
}
