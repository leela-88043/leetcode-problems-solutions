/*
    Problem: Range sum query
    Algorithm:
    1. we have to implement the prefix sum's approach.
    2. if they are asking the in between range then we have to write the
    logic by subtracting the indices so that we get the required result.
*/
//Source Code:

class NumArray {
    int[] nums;
    public NumArray(int[] nums) {
        this.nums=nums;
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
          return nums[right];  
        }else{
            return nums[right]-nums[left-1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */