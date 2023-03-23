package fp.dam.examen2ev;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {

	public static void main(String[] args) {

		Coche coche = new Coche("2099GCJ", 5);
		Microbus microbus = new Microbus ("1407BPZ", 39);
		Furgoneta furgoneta = new Furgoneta ("9999KLP", 6000);
		Camion camion = new Camion ("0000AAA", 60000);
		Set<Alquiler> Fudge = new TreeSet<>();
		
		Fudge.add(furgoneta);
		Fudge.add(coche);
		Fudge.add(microbus);
		Fudge.add(camion);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Numero de dias?\n>");
		int d = scanner.nextInt();
		scanner.close();
		
		Fudge.forEach(e -> e.getPrecioAlquiler(d));
		
	}

}
