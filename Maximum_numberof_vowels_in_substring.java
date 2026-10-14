class Solution {
    public int maxVowels(String s, int k) {
        int right =0;
        int left =0;
        int max_len=0;
        int count=0;
        int vocount=0;
        char out;
        while(right<s.length()){
            char in = s.charAt(right);
            if('a'<=in && in<='z'){
                count++;
            }
            if(in=='a'||in=='e'||in=='i'||in=='o'||in=='u'){
                vocount++;
            }
            if(count==k+1){
                out = s.charAt(left);
                if(out=='a'||out=='e'||out=='i'||out=='o'||out=='u'){
                    vocount--;
                }
                count--;
                left++;
            }
            if(vocount>max_len){
                max_len=vocount;
            }
            right++;
        }
        return max_len;
    }
}