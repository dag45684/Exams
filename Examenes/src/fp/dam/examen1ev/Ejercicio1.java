package fp.dam.examen1ev;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		long randLong = (long) (Long.MIN_VALUE + Math.random() * Long.MAX_VALUE) * (random.nextBoolean() ? 1 : -1);
		boolean like = getLike(randLong);
		char[] digits = getDigits(randLong);
		
		System.out.println("Long value: " + randLong);
		System.out.println("Do i like it?: " + like);
		System.out.println("Characters forming the number: " + Arrays.toString(digits));
	}
	
	static boolean getLike(long randLong) {
		char[] nums = String.valueOf(randLong).toCharArray(); //TODO ITS CHAR
		int pair=0;
		int odd=0;
		for (int i=0; i<nums.length; i++) {
			pair += Character.valueOf(nums[i])%2==0 ? Character.valueOf(nums[i]) : 0;
			odd += Character.valueOf(nums[i])%2!=0 ? Character.valueOf(nums[i]) : 0;
		}
		boolean ok = odd>pair ? true : false;
		int tot=0;
		for (char x : nums) tot+=Character.valueOf(x);
		ok = randLong%2!=0 && tot%2!=0;
		return ok;
	}
	
	static char[] getDigits(long randLong) {
		return String.valueOf(Math.abs(randLong)).toCharArray(); 
	}
}
