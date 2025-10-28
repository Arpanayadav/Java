class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
         int i=0;
        for( i=0;i<=n;i++){
             int count=0;
            if(nums[i]==nums[i+1]){
            count+=1;
            }
           if (count>=(n/2))
            return nums[i];
        }
        return nums[i];
    }
        //  if(count>=(n/2))
        //    return nums[i];
}
class Day1{
public static void main(String args[]){
    Solution obj=new Solution();
   int nums[]={2,2,1,1,1,2,2};
   obj.majorityElement(nums);
}
}
