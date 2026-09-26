import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> twosum=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        
        for(int i=0; i< nums.length;i++){
            int req=target-nums[i];
            if(twosum.containsKey(req)){
                arr.add(twosum.get(req));
                arr.add(i);
            }
            else{
                twosum.put(nums[i],i);
            
            }
        }
        int arr1[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            arr1[i]=arr.get(i);
        }
        return arr1;
    }
}