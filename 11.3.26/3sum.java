class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        //why n-2? because if we fix the 3rd last element, we are eitherways checking the second last and last using L and R
        for(int i=0;i<n-2;i++){
            //no duplicates so skip the onces already counted
            if(i>0 && nums[i]==nums[i-1]) continue;
            // -4 -1 -1 0 1 2
            //  F  L        R
            int l=i+1;
            int r=n-1;
            int fixed=nums[i];

            while(l<r){
            //if sum is zero, condition satisfied
            int sum=fixed+nums[l]+nums[r];
            if(sum==0){
                /*ds.add(fixed);
                ds.add(nums[l]);
                ds.add(nums[r]);
                res.add(ds);
                ds=new ArrayList<>();*/
                res.add(Arrays.asList(fixed,nums[l], nums[r]));
                //skip duplicates again
                while(l<r && nums[l] == nums[l + 1])l++;
                while(l<r && nums[r] == nums[r - 1])r--;
                //move to one space ahead, since after the while loop the pointers are on the last occurences of the duplicates
                l++;
                r--;
            }
            //sliding window basics eh
            else if(sum<0) l++;
            else r--;
            }
        }
        return res;
    }
}
