// Last updated: 5/25/2026, 11:13:56 AM
class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int c[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                    if(nums[i]+nums[j]==target && i!=j)
                    {
                        c[0]=j;
                        c[1]=i;  
                        break;            
                    }
            }
        }
        return c;
    }
}