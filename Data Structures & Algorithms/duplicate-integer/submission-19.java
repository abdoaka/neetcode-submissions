class Solution {
    public boolean hasDuplicate(int[] nums) {

        for(int i = 0 ; i <= nums.length -1 ; i++)
        {
            for(int j = i +1 ; j <=nums.length -1 ; j++ )
                {
                  //  int [] tmp = nums[i] ;
                       if(nums[i] == nums[j] )
                            return true;
                }
        }
        return false;
}
}