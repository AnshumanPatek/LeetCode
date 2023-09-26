class Solution {
    public int maxProduct(int[] nums) {

        
        Arrays.sort(nums);
        int check = nums.length;
        //int product=(nums[check - 1]-1)*(nums[check-2]-1);
       // return product;
       return (nums[check-1]-1)*(nums[check-2]-1);

        //hello

    }
}
