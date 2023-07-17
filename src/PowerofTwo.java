public class PowerofTwo{
	public boolean isPowerOfTwo(int n) {
	      /*  int i = 1;
	        while(i < n){
	            i *=2;
	        }
	        return i == n;
	    }*/

	        if(n == 0){
	            return false;
	        }
	        while(n != 1){
	            if(n % 2 != 0){
	                return false;
	            }
	            else{
	                n = n / 2;
	            }
	        }
	        return true;
	    }
	
}