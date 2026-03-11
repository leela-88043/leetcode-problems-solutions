/* Given : array of integers named nums.
Task : we have to return a array of integers which are the product of the all other numbers in nums except nums[i].
Topics : Prefix products,arrays.
Approach : Here for finding the product of array except self.
1. we have to find the prefix products until the before number and also suffix products also we have to find and we have to store these numbers in the array.
2. Now we have to product these two arrays so that we will get the actual result that we want.
*/
// Source Code:
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length]; // prefix products
        int[] suffix = new int[nums.length]; // suffix products and it is used as the solution array also
        prefix[0]=1;
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i-1]*prefix[i-1]; // this is the loop which is used to store prefixes
        }
        suffix[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=nums[i+1]*suffix[i+1]; // here we will find the suffixes of every element 
            suffix[i+1]=prefix[i+1]*suffix[i+1]; // here after finding each and every element in the suffix we wil multiply that with the prefix and store it in the suffix array itself
        }
        return suffix;
    }
}
