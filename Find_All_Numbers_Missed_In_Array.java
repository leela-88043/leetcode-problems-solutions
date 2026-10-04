/*
    Problem: Find all the Missing numbers in the array
    Algorithm:
    1. we have to create a array which contains whether the number is 
    present or not in the array for that we will use the boolean array
    2. then we will run a loop for checking the false indexed numbers
    so that we can store them and store it in the List and we can return
    it to the function.
*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] bool = new boolean[nums.length+1];
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            bool[nums[i]]=true;
        }
        bool[0]=true;
        for(int i =0;i<nums.length+1;i++){
            if(bool[i]==false){
                result.add(i);
            }
        }
        return result;
    }
}