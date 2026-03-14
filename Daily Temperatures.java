/*
Given : temperature named array 
Approach : using the monostack
*/
//Source Code:
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> help = new Stack<>();
        int x = temperatures.length;
        int[] result = new int[x];
        for(int i =x-1;i>=0;i--){
           while(!help.isEmpty() && temperatures[i]>= temperatures[help.peek()]){
                help.pop();
           }
           if(!help.isEmpty()){
                result[i]=help.peek()-i;
           }
           help.push(i);
        }
        return result;
    }
}
