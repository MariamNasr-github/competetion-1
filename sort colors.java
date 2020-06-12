//sort colors leetcode
//https://leetcode.com/problems/sort-colors/submissions/


class Solution {
    public void sortColors(int[] nums) 
    {
    
        int counter0=0;
        int counter1=0;
        int counter2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                counter0++;
            }
            else if(nums[i]==1){
                counter1++;
            }
            else if(nums[i]==2){
                counter2++;
            }
        }
        int index=0;
        while(counter0!=0)
        {
            nums[index]=0;
            index++;
            counter0--;
        }
        while(counter1!=0)
        {
            nums[index]=1;
            index++;
            counter1--;
        }
        while(counter2!=0)
        {
            nums[index]=2;
            index++;
            counter2--;
        }
        
        }
        
        
    }

