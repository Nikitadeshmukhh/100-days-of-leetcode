class Solution {
    public String sortString(String s) {
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
       StringBuilder sb=new StringBuilder(s.length()); 
        while(sb.length()<s.length()){
            for(int i=0;i<26;i++)
            {
                if(freq[i]!=0){
                    sb.append((char)(i+'a'));
                    freq[i]--;
                }
            }
            for(int i=25;i>=0;i--)
            {
                if(freq[i]!=0)
                {
                    sb.append((char)(i+'a'));
                    freq[i]--;
                }
            }
        }
        return sb.toString();
    }
}
