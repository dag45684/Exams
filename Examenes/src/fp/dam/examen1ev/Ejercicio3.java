package fp.dam.examen1ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		String s = Reading();
		System.out.println();
		PrintAlpOrd(s);
	}
	
	static void PrintAlpOrd(String s) {
		String[] r = s.split(" ");
		Arrays.sort(r);
		for (int i=0; i<r.length; i++) 
			System.out.println(r[i] + " | " + Cypher(r[i]));
	}
	
	static int Cypher (String s) {
		int res=0;
		for (int i=0; i<s.length(); i++) {
			if ("aeiouAEIOU".contains(Character.toString(s.charAt(i)))) {
				res += s.charAt(i) * s.length();
			}
			else {
				res += s.charAt(i) / s.length();
			}
		}
		return res;
	}
	
	static String Reading () throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Number of words to input: ");
		int n = Integer.parseInt(br.readLine());
		String[] out = new String[n];
		for (int i=0; i<n; i++) {
			System.out.println("Write your words one by one: ");
			out[i]=br.readLine();
		}
		String s = String.join(" ", out);
		return s;
	}
}
