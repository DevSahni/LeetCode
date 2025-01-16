class Solution {
    public int maxProfit(int[] nums) {
        int minvalue=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<nums.length;i++){
             if(nums[i]<minvalue){
              minvalue=nums[i];
        }
        if(maxProfit<nums[i]-minvalue){
            maxProfit=nums[i]-minvalue;
        }
      //maxProfit=Math.max(maxProfit,nums[i]-minvalue);
    }
        return maxProfit;
    }
}