/* Given : an integer array -> nums and k-> frequency.
   
   Task : we have to find the top most freequent element in an array and return it to the main function here k -> is the representing number it will decide how many numbers 
   it wil decide how many numbers should be we have to give into array.

   Approach : 1. We have to find the map for frequency and the element.
   2. next we have to use the bucket sort algorithm by creating a list and in that we have to create a array list so that we can store all other 
   elements which are having the same frequency.
   3. we have to create a array so that we can add our top frequent elements.
*/
//Source Code:
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }//this will give the frequencies and key values
        for(int key : map.keySet()){
            int frequency = map.get(key);
            if(bucket[frequency]==null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] result = new int[k];
        int counter = 0;
        for(int i=bucket.length-1;i>=0 && counter<k;i--){
            if(bucket[i]!=null){
                for(int num : bucket[i]){
                    result[counter++] = num;
                }
            }
        }
        return result;
    }
}
