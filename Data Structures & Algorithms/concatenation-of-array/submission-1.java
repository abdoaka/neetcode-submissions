class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] intial = nums ; 
        int [] ans = Arrays.copyOf(intial, nums.length*2);
        for(int i = nums.length ; i < ans.length ; i++)
            ans[i] = intial[i - nums.length];
        return ans;
    }
}