package leetCode;

public class IntToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 int[] value = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	    String[] roman = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	    
	    public String intToRoman(int num) {
	        StringBuilder str = new StringBuilder();
	    
	        for(int i = 0; i < value.length; i++){
	            while(num >= value[i]) {
	                str.append(roman[i]);
	                num -= value[i];
	            }
	        }   
	        return String.valueOf(str);
	    }
}
