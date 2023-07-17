public class HouseRobber{
	
	 public int rob(int[] nums) {
	        //Eğer bir sayı varsa
	        if(nums.length < 2){
	            return nums[0];
	        }

	        //Her ev eklendiğinde max lootu ekleyeceğimiz dizi
	        int[] loot = new int[nums.length];

	        // İlk iki evei ekliyoruz
	        loot[0] = nums[0];
	        loot[1] = Math.max(nums[0], nums[1]);

	        //Diğer evleri ekliyoruz
	        for(int i = 2; i < nums.length; i++){
	            loot[i] = Math.max(loot[i - 2] + nums[i], loot[i-1]);
	        }
	        return loot[nums.length - 1];
	    }
	
}