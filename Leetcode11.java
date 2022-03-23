public class Leetcode11 {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int a;
        int area = 0;
            
        while(l <= r) {
            a = Math.min(height[l], height[r]) * (r - l);
            
            if (height[l] <= height[r]) {
                l += 1;
            }
            else{
                r -= 1;
            }
            
            area = Math.max(area, a);
        }
        return area;
    }
}


