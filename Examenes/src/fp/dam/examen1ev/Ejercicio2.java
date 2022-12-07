package fp.dam.examen1ev;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		float[] nums = createNums();
		float res = getResult(nums);
		
		System.out.println("Array: " + Arrays.toString(nums));
		System.out.println("Result of the sum: " + res);
	}
	
	static float[] createNums () {
		float[] nums = new float[(int)(Math.random()*50)+10]; //TODO SET PRECISION
		for(int i=0; i<nums.length; i++) {
			nums[i] = (float) (Math.random() * 2000 - 1000);
		}
		return nums;
	}
	
	static float getResult(float[] nums) {
		float sum=0;
		float tot=0;
		boolean shut = false;
		for (float x : nums) tot+=x;
		for (int i=0; i<nums.length; i++) {
			sum += nums[i];
			if (sum > tot/2){
				sum = sum * 0.3333f;
				i = nums.length;
				shut=true;
			}
		}
		return shut ? sum : sum * 0.6666f;
	}
}
