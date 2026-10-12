/*
    Problem: Permutation in string
    Algorithm:
    1. first we have to store the frequencies of the first string.
    2. we have to run a loop for incoming character we should check
    whether it is there or not there we will just decreae.
    3. now when it comes to the stage when it increases the fixed 
    window size then we will remove the character from the left section
    and checks whether the element frequency is 0 or not.
    4. then atlast we wil check at every stage that all the elements are empty or not so that
    we can identify the substring is present or not. 
*/

// Source Code:

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k= s1.length();
        int right=0;
        int left=0;
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(freq.containsKey(s1.charAt(i))){
                freq.put(s1.charAt(i),freq.get(s1.charAt(i))+1);
            }else{
                freq.put(s1.charAt(i),1);
            }
        }
        while(right<s2.length()){
            // adding the new element;
            char in = s2.charAt(right);
            freq.put(in,freq.getOrDefault(in,0)-1);
            if(freq.get(in)==0){
                freq.remove(in);
            }
            right++;
            //removing the element and handling the frequency zero;
            if(right-left>k){
                char out = s2.charAt(left);
                freq.put(out,freq.getOrDefault(out,0)+1);
                if(freq.get(out)==0){
                    freq.remove(out);
                }
                left++;
            }
            if(right-left==k && freq.isEmpty()){
                return true;
            }
        }
        return false;
    }
}