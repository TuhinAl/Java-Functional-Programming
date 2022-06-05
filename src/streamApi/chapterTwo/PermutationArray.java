package streamApi.chapterTwo;

public class PermutationArray {
	 public static int[] buildArray(int[] nums) {
	     int [] ans = new int [nums.length];
	        for(int i = 0; i < nums.length ; i++){
	        	int temp = nums[i];
	            ans[i] = nums[temp];
	        }
	        System.out.println(ans);
	        return ans;
	    }
	 public static void main(String[] args) {
		 int[] nums = {0,2,1,5,3,4};
		 PermutationArray.buildArray(nums);
		
	}

}
