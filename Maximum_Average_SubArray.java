/*
    problem: maximum average subarray
    Algorithm: 
    1. Sliding window approach by moving the fixed size window we will
    compute the solution periodically.
*/
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int j=k,i=0;
        double avg=0;
        double maxavg;
        double sum=0;
        while(j>0){
            sum=sum+nums[i];
            i++;
            j--;
        }
        avg=sum/k;
        maxavg=avg;
        int left=0;
        for(int s=k;s<nums.length;s++){
            sum =  sum-nums[left]+nums[s];
            avg=sum/k;
            left++;
            if(maxavg<avg){
                maxavg=avg;
            }
        }
        return maxavg;
    }
}