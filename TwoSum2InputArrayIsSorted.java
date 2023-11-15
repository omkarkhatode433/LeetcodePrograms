public class TwoSum2InputArrayIsSorted {
    
}
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s=0;
        int e=numbers.length-1;
        while(s<e){
            if(numbers[s]+numbers[e]<target){
                s++;
            }else if(numbers[s]+numbers[e]==target){
                return new int[]{s+1,e+1};
            }else{
                e--;
            }
        }
        return new int[]{};
        
    }
}