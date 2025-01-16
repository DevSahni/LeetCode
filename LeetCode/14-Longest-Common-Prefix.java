class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       String str1=strs[0];
       String str2=strs[strs.length-1];
       int Index =0;
       while(Index<str1.length()){
            if(str1.charAt(Index)==str2.charAt(Index)){
                Index++;

            }
            else{
                break;
            }
            
       }
       return Index==0?\\:str1.substring(0,Index);
    }
}