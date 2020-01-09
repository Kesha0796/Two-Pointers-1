class Solution {
    public int maxArea(int[] height) {
        int front=0,back=height.length-1,max=0;
        while(front<back)
        {
            int vol= Math.min(height[front],height[back]) * (back-front);
            if(vol>max)
                max=vol;
            if(height[front]<height[back])
                front++;
            else back--;
        }
        return max;
    }
}

// Time Complexity: O(n), as we are using only 1 for loop.
// Space Complexity: O(1), as we are not using any extra space.