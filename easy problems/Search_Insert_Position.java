class Solution {
    public int searchInsert(int[] nums, int target) {
      int index=0;
        if(nums.length==1){
            if(nums[0]==target)
                index=0;
            else if(nums[0]<target)
                index=1;
            else
                index=0;
        }
    else {
      for(int i=0;i<nums.length-1;i++){
          if(nums[i]==target){
                index=i;
                break;
          }
          else {
              if(nums[i]>target){
                  index=i;
                  break;
              }
              else if(nums[i]<target&& nums[i+1]>=target){
                  index= i+1;
                  break;
              }
              else if(nums[i]<target && nums[i+1]<target)
                index=i+2;
          }
      }
      }
        return index;
    }
}
