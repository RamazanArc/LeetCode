public class ReverseInteger{
	
	public int reverse(int x) {
        long temp = 0;
        int lastDigit;
        while(x != 0){
            lastDigit = x % 10;
            temp = temp *10 + lastDigit;
            x = x / 10;

            if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int)temp;
    }
}
//123 temp 3 x 12 
// temp 32 x 1
// temp 321 0
	
}