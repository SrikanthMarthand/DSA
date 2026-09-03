class Solution {
    public int maxArea(int[] height) {
    
    int left=0;
    int right=height.length-1;
    int result=0;
    while(left<right)
    {
      int width=right-left;
      int ch=Math.min(height[left],height[right]);
      int area=width*ch;
      result=Math.max(result,area);
      if(height[right]>height[left]){
        left++;
      }
      else{
        right--;
      }
    }

    return result;
}
}