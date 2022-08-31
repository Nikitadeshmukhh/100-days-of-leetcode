class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
           if(selfDividing(i))
               list.add(i);
        }
        return list;
    }
    public boolean selfDividing(int i){
        int number=i;
        while(number>0)
        {
            int digit=number%10;
            number=number/10;
            if(digit==0 || (i%digit)>0)
                return false;
        }
        return true;
    }
}
