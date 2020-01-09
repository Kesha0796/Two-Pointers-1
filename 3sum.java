class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        if(nums==null || nums.length<3)
            return ans;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int low=i+1;
            int high=nums.length-1;
            while(low<high)
            {
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0)
                {
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    ans.add(list);
                    list=new ArrayList<>();
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1]) low++;
                    while(low<high && nums[high]==nums[high+1]) high--;
                }
                else if(sum>0)
                    high--;
                else if(sum<0)
                    low++;
            }
        }
        return ans;
    }
}

// Time Complexity: O(n2)+ O(nlogn), because using function to sort array and also we are using 2 for loops for making sum to 0
// Space Complexity: O(1) as we are not using any extra auxillary space, only space used it to create output list.