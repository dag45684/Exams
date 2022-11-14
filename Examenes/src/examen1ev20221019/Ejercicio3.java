package examen1ev20221019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ejercicio3 {
	
	public static int[] retarray () {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Select size of the vector (10/200)");
		int size=0;
		boolean ok=false;
		do {
			try {
				size = Integer.parseInt(br.readLine());
				if (size >= 10 && size <=200) {
					ok=true;
				}
				else System.out.println("Wrong size");
			}catch (NumberFormatException | IOException e) {
				System.out.println("not a number!");
			}
		}while (!ok);
		int[] nums = new int[size];
		for (int i=0; i<size; i++) {
			nums[i]=(int)(Math.random()*200)-100;
		}
		return nums;
	}

	public static int[] retresult (int[] nums) {
		int res=0;
		int size=nums.length;
		for (int i=0; i<nums.length; i++) {
			if (nums[i]!=13) res+=nums[i];
			else {
				int temp=0;
				for(int j=0; j<13; j++) {
					temp+=nums[i+j];
				}
				if (temp!=7) {
					i+=13;
					size-=13;	
				}
				else res+=temp;
			}
		}
		int[] result = { res, (nums.length-size)}; 
		return result;
		
	}
	
	public static void main(String[] args) {

		int[] nums=retarray();
		int[] result=retresult(nums);
		System.out.println("\nVector is:");
		System.out.println(Arrays.toString(nums));
		System.out.println("\nSum of all array numers is:");
		System.out.println(result[0]);
		System.out.println("\nUnused numbers:");
		System.out.println(result[1]);

	}

}
