package examen1ev20221019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {
	
	static int Sum (int a, int b, int c) {
		int[] nums = new int[3]; 
		for(int i=0; i<3; i++) {
			switch (i) {
			case 0:
				nums[i]=a;
				break;
			case 1:
				nums[i]=b;
				break;
			case 2:
				nums[i]=c;
				break;
			}
		}
		int res=0;
		for (int i=0; i<3; i++) {
			if ((nums[i]<13 || nums[i]>19) || (nums[i]==15 || nums[i]==16)) {
				res+=nums[i];
			}
		}
		return res;
	}

	static int Aprox (int x, int y) {
		if(x>21)x=0;
		if(y>21)y=0;
		return ((21-y)>(21-x) ? x : y);
//		if (y>21 && x>21) return 0;
//		else {
//			int difx=21-x;
//			int dify=21-y;
//			if (dify==difx) return 0;
//			else return (difx > dify ? x : y);
//		}
	}
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
//		int a=0;
//		int b=0;
//		int c=0;
//		System.out.println("Please input 3 numbers:");
//		for (int i=0; i<3; i++) {
//			boolean ok=false;
//			do {
//				try {
//					switch (i) {
//					case 0:
//						a=Integer.parseInt(br.readLine());
//						break;
//					case 1:
//						b=Integer.parseInt(br.readLine());
//						break;
//					case 2:
//						c=Integer.parseInt(br.readLine());
//						break;
//					}
//					ok=true;
//				} catch (NumberFormatException | IOException e) {
//					System.out.println("Thats not a number");
//				}
//			}while(!ok);
//		}
//		int res = Sum (a, b, c);
//		System.out.println("The sum function returns " + res);
		
		// Second part of the exercise
		
		System.out.println("Second part:\nInput two numbers:");
		int x=0;
		int y=0;
		for (int i=0; i<2; i++) {
			boolean ok=false;
			do {
				try {
					switch (i) {
					case 0:
						x=Integer.parseInt(br.readLine());
						break;
					case 1:
						y=Integer.parseInt(br.readLine());
						break;
					}
					ok=true;
				} catch (NumberFormatException | IOException e) {
					System.out.println("Thats not a number");
				}
			}while(!ok);
		}
		int res2 = Aprox(x,y);
		System.out.println("Closest number to 21 without surpass was "+res2);
	}

}
