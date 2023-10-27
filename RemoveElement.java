public class RemoveElement {
    
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int li=nums.length-1;
        for(int i=0;i<li;i++){
            if(i>=li){
                break;
            }
            if(nums[i]==val){
                while(nums[li]==val){
                   
                    li--;
                     if(i>=li){
                break;
            }
                     if(li==-1){
                        break;
                    }
                }
                 if(li==-1){
                        break;
                    }
                     if(i>=li){
                break;
            }
                int tmp=nums[i];
                nums[i]=nums[li];
                nums[li]=tmp;
                
                System.out.println(Arrays.toString(nums));
            }
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                break;
            }
            count++;
        }
        Arrays.toString(nums);
        return count;
        
    }
}