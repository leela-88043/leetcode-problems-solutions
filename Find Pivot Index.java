/* 
Given : an array of nums.
Task : To find pivot index and we have to return it. pivot index means it is the index which is excluding that index the remaining left and right sums should be equal.
My Approach : 1.here for every index we have to calculate the right sum and the left sum without including this index's element value.
2. for this we use prefix sum method this approach will provide us the access for calculating right and left sums.
3. to implement this two equations are required 
    1. for leftsum : we have to use prefixes for that one leftsum = prefix[i-1];
    2. for rightsum : we have to know total sum of the array then equation goes like this => rightsum = totalsum - leftsum - nums[i];
4. after that we have to compare then if it doesn't give any we have to return -1.
5. if it matches then we will give the same index.

Topics : prefix sum, arrays handling
*/
// Source Code:
class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0]=nums[0];
        int flag =0;
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int total = prefix[nums.length-1];
        int leftsum =0;
        for(int i=0;i<nums.length;i++){
            if(i>0){
                leftsum = prefix[i-1];
            }
            int rightsum = total - leftsum - nums[i];
            if(leftsum==rightsum){
                return i;
            }else{
                flag =1;
            }
        }
        if(flag==1)
            return -1;
        return 0;
    }
}
