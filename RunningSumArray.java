public class RunningSumArray {
    public static void main(String[] args) {
        int nums[] ={3,1,2,10,1};
        RunningSumArray caller = new RunningSumArray();
        int answer [] = caller.runningSum(nums);
        for(int i : answer){
            System.out.println(i);
        }

    }

    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length; i++){
            sum+=nums[i]; 
            nums[i]=sum;   
        }
        return nums;
    }
}
