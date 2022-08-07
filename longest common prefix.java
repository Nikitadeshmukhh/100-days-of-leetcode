class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length ==0){
        return "";
    }
 
    if(strs.length == 1){
        return strs[0];
    }
 
    int i=0;
    while(true){
        boolean flag = true;
        for(int j=1; j<strs.length; j++){
            if(strs[j].length()<=i || strs[j-1].length() <=i 
               || strs[j].charAt(i) != strs[j-1].charAt(i)){
                flag = false;
                break;
            }               
        }
 
        if(flag){
            i++;
        }else{
            break;
        }
    }
 
    return strs[0].substring(0, i);
}
}
//Another optimised solution can be:-

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length ==0){
        return "";
    }
    if(strs.length == 1){
        return strs[0];
    }
   String prefix=strs[0];
   for(int i=1;i<strs.length;i++)
   {
       while(strs[i].indexOf(prefix)!=0)
       {
           prefix=prefix.substring(0,prefix.length()-1);
           if(prefix.isEmpty()) return "";
       }
   }
        return prefix;
}

}
