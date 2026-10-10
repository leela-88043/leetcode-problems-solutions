/*
    Problem: Fruits into baskets
    Algorithm:
    1. we have to take the variable sliding window by traversing every fruit type
    we will decide whether we have to add it or not.
    2. if we won't find more type of fruits then we will just simply return
    the max_len. 
    3. if there are more than two types of fruits then we will just adjust
    the sliding window and decrease the count of the left fruit.
    4. if the frequency goes to 0 then we will permenantly remove the
    element from the hash map.
*/
class Solution {
    public int totalFruit(int[] fruits) {
        int right=0;
        int left=0;
        int max_len=0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        while(right<fruits.length){
             if(freq.containsKey(fruits[right])){
                freq.put(fruits[right],freq.get(fruits[right])+1);
            }else{
                freq.put(fruits[right],1);
            }
            right++;
            while(freq.size()>2){
                freq.put(fruits[left],freq.get(fruits[left])-1);
                if(freq.get(fruits[left])==0){
                    freq.remove(fruits[left]);
                }
                left++;
            }
            if(max_len<right-left){
                max_len=right-left;
            }
        }
        return max_len;
    }
}