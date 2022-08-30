class Solution {
    public void insert(int arr[],int i,int j)
    {
        if(j<arr.length)
        {
            arr[j]=arr[i];
        }
    }
    public void duplicateZeros(int[] arr) {
        int count=0;
        for(int c:arr){
            if(c==0)
                count++;
        }
       int i=arr.length-1;
        int j=arr.length-1+count;
        while(i!=j)
        {
            insert(arr,i,j--);
            if(arr[i]==0)
                insert(arr,i,j--);
            i--;
        }
    }
}
