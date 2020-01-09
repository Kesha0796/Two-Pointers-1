class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==1)
                mid++;
            else if(nums[mid]==0)
            {
                swap(nums,mid,low);
                mid++;
                low++;
            }
            else
            {
                swap(nums,mid,high);
                high--;
            }
        }
    }
    private void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

// Time Complexity: O(n), only 1 for loop
// Space Complexity: O(1), no extra space used