package examen1ev20221019;

import java.util.Arrays;

public class Ejercicio1 {
	
	static int Mostrar(int[] nums) {
		System.out.println("This is the array:");
		System.out.println(Arrays.toString(nums));
		int rand = (int)(Math.random()*nums.length)-1;
		return nums[rand];
	}

	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) {
			System.out.println((int)(Math.random()*10)+1);
		}
		
		int[] nums = new int[(int)(Math.random()*10)+1];
		for (int i=0; i<nums.length; i++) {
			nums[i]=(int)(Math.random()*10)+1;
		}
		int n = Mostrar(nums);
		System.out.println("The random number is: "+n);

	}

}
