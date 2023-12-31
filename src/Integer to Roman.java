public class IntegertoRoman{
	
	public String intToRoman(int num) {
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < numbers.length; i++){
            while(num >= numbers[i]){
                builder.append(roman[i]);
                num -= numbers[i];
            }
        }
        return builder.toString();
    }
	
	
}