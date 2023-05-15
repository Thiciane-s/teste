package teste;

import java.util.Scanner;


public class ProgramaInterface {
	
	public int cont = 0; 
	public ProgramaInterface() {
		
	}
	
	static int tela (){

		//lendo a opção digitada
		Scanner scanner = new Scanner(System.in);
		
		//imprimindo na tela o menu da interface
		System.out.printf("+-----------------------------------------+\n");
		System.out.printf("+ Dependencias----------------------------+\n");
		System.out.printf("+-----------------------------------------+\n");
		System.out.printf("| Selecione uma das operações abaixo:     |\n");
		System.out.printf("| 1 - Inserir Dependencia de A            |\n");
		System.out.printf("| 2 - Inserir Dependencia de B            |\n");
		System.out.printf("| 3 - Inserir Dependencia de C            |\n");
		System.out.printf("| 4 - Inserir Dependencia de D            |\n");
		System.out.printf("| 5 - Inserir Dependencia de E            |\n");
		System.out.printf("| 6 - Imprimir                            |\n");
		System.out.printf("| 7 - SAIR                                |\n");
		System.out.printf("+-----------------------------------------+\n");
		System.out.printf("Digite uma opção:\n");
		
		
		
		int resposta = scanner.nextInt();

		return resposta;
		
	}
	
	//declarando o metodo principal
	public static void main(String args[]){
		
		
		ProgramaInterface c = new ProgramaInterface();
		//Insere a quantidade de entradas de dependencias
		Dependencia g = new Dependencia (5);
		
		
        int sair = 0; //sair igual a 0 indica continuar
		
		
		Scanner scanner = new Scanner(System.in);
		
		//enquanto nao for precionado 7, o programa nao para
      
		while(sair != 7){
          
			sair = tela();

			switch(sair){
				
				
				case 1:
					if (c.cont < 5) {
						System.out.printf("Inserir dependencia de A\n");
	
	
						System.out.printf("Digite:\n");
	
						//lendo o valor digitado
						char depend_A = scanner.next().charAt(0);
						
						
						g.delimitaLista('A', depend_A);
						c.cont++;
					}else {
						System.out.println("Foram criadas 5 dependencias, imprima a lista1!");
					}
				

					break;

				case 2:
					if(c.cont < 5) {
						System.out.printf("Inserir dependencia de B\n");
	
	
						System.out.printf("Digite:\n");
	
						//lendo o valor digitado
						char depend_B = scanner.next().charAt(0);
					
						g.delimitaLista('B', depend_B);
						c.cont++;
					}else {
						System.out.println("Foram criadas 5 dependencias, imprima a lista1!");
					}
					
					break;	

				case 3:
					if(c.cont <5) {
						
						System.out.printf("Inserir dependencia de C\n");
	
						System.out.printf("Digite:\n");
	
						//lendo o valor digitado
						char depend_C = scanner.next().charAt(0);
					
					
						g.delimitaLista('C', depend_C);
						c.cont++;
					}else {
						System.out.println("Foram criadas 5 dependencias, imprima a lista1!");
					}
					
					break;
											
				case 4:
					if(c.cont < 5) {
						System.out.printf("Inserir dependencia de D\n");
	
						System.out.printf("Digite:\n");
	
						//lendo o valor digitado
						char depend_D = scanner.next().charAt(0);
					
						g.delimitaLista('D', depend_D);
						c.cont++;
					}else {
						System.out.println("Foram criadas 5 dependencias, imprima a lista1!");
					}
					break;
					
				case 5:
					if(c.cont < 5) {
						
						System.out.printf("Inserir dependencia de E\n");
	
						System.out.printf("Digite:\n");
	
						//lendo o valor digitado
						char depend_E = scanner.next().charAt(0);
					
					
						g.delimitaLista('E', depend_E);
						c.cont++;
					}else {
						System.out.println("Foram criadas 5 dependencias, imprima a lista1!");
					}
					
					break;	
				
				case 6:

					System.out.println("++++++++++++++++++++++++++++++");
					System.out.println("LISTA DE DEPENDENCIAS");
					g.dependencia();
					
					sair = 7;
					break;
				
			}
		}
        
     scanner.close();
	}
	
}
