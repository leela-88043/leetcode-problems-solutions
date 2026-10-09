/*
    Problem: Contains duplicate 2
    Algorithm: 
    1. first we have to initialize a hash set and then we have to add the
    elements one by one and check the conditions like it is there are not.
    2. then secondly we have to remove the element when we are moving the
    window by removing the element from the set.

*/
// Source Code:

import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);

            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}