//search insert position leetcode
//https://leetcode.com/problems/search-insert-position/submissions/

class Solution {
    public int searchInsert(int[] nums, int target) 
    {
    
        int left= 0;
        int right = nums.length- 1;
        int ans=0;

        while (left<= right)
        {
            int middle = left+(right-left)/2;       
            if (nums[middle] == target)
            {
                ans=middle;
                return ans;
            }

            else if (nums[middle] < target)
            {
                left = middle + 1;
                if(target>nums[nums.length-1]){
                    ans=nums.length;
                    return ans;   
                }
            }
            else if(middle-1<0){
                 ans=middle;
                   return ans; 
            }
            else
            {
                if(target>nums[middle-1])
                {
                   ans=middle;
                   return ans; 
                }
                 right = middle - 1;
                
            }
          
    }   
    return ans;
   
    }
}
