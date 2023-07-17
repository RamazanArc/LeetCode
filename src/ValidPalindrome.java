public class ValidPalindrome{

	 public boolean isPalindrome(String s) {
	        if(s.length() == 0){
	            return true;
	        }

	        String pal = "";
	        for(int i = 0; i < s.length(); i++){
	            if(Character.isLetterOrDigit(s.charAt(i))){
	                pal += s.charAt(i);
	            }
	         }
	            pal = pal.toLowerCase();
	            int first = 0;
	            int last = pal.length() - 1;
	            while(first < last) {
	                if(pal.charAt(first) != pal.charAt(last)){
	                    return false;
	                }
	                else{
	                    last--;
	                    first++;
	                }
	            }    
	         return true; 
	    }
}