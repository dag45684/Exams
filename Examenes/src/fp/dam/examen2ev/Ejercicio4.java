package fp.dam.examen2ev;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Ejercicio4 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		List.of(13, -5, 21, -101, 73, 67).forEach(q::offer);
		modificarCola(q);
		System.out.println(q);
	}
	
	public static void modificarCola (Queue<Integer> q) {
		Stack<Integer> aux = new Stack<>();
		 for (int i=0; i<q.size(); i++) {
			aux.add(q.peek());
			int temp = q.poll();
			q.add(temp);
		 }
		 aux.forEach(e -> q.add(e));
		 //y me quedo sin tiempo para entregar aqui lo mismo pero con la segunda mitad
	}

}
