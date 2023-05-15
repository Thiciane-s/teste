package teste;

import java.util.*;

public class Dependencia {
	
	private int numeroVertices;
	private ArrayList<ArrayList<Character>> adjLista;
	
	public Dependencia(int numero) {
		numeroVertices = numero;
		adjLista = new ArrayList<ArrayList<Character>>(numero);
		for (int i = 0; i < numero; ++i) {
			adjLista.add(new ArrayList<Character>());
		}
	}
	
	public void delimitaLista(Character v, Character w) {
		adjLista.get((int) (v - 65)).add(w);
	}
	
	public void ordenamento(char depend, boolean verificado[], Stack<Character> stk) {
		
				verificado[(int) (depend - 65)] = true;
				Character j;
		
				Iterator<Character> itr = adjLista.get((int) (depend - 65)).iterator();
				while (itr.hasNext()) {
					
					j = itr.next();
					
					if (verificado[(int) (j - 65)] == false) {
						// recursively traversing the adjecent nodes
						ordenamento(j, verificado, stk);
					}
				}
				stk.push(depend);
	}
	
	public void dependencia() {
		
				Stack<Character> stk = new Stack<Character>();
				ArrayList<Character> lista = new ArrayList<Character>();
				boolean verificado[] = new boolean[numeroVertices];
		
				for (int i = 0; i < numeroVertices; i++) {
					verificado[i] = false;
				}
		
				for (int j = 0; j < numeroVertices; j++) {
					if (verificado[j] == false) {
						ordenamento((char) (j + 65), verificado, stk);
					}
				}
		
				while (stk.empty() == false) {
					lista.add(stk.pop());
					
				}
				
				for (int i = lista.size()-1; i>= 0 ; i--) {
					System.out.print(lista.get(i));
					
				}
				
			}
		
	

}
