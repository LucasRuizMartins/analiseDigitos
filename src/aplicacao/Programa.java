package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long numero = 0;
		int decimais = 1;
		char contadorNumero;
		int cont[] = new int[10];
		cont[0] = 0;
		cont[1] = 0;
		cont[2] = 0;
		cont[3] = 0;
		cont[4] = 0;
		cont[5] = 0;
		cont[6] = 0;
		cont[7] = 0;
		cont[8] = 0;
		cont[9] = 0;

		System.out.println("Digite uma sequencia numerica para avaliarmos a repeticao de numeros:");
		
		try {
		numero = sc.nextLong();
		}
		
		catch (InputMismatchException e) {
			System.out.println("erro, excedeu o numero possivel se ler, Por favor digite até 19 digitos");
			
			
		}
		int n = contarDigitos(numero);
		System.out.println();

		int vet[] = new int[n];
		for (int i = 0; i < n; i++) {
			numero = numero;
			vet[i] = (int) separaDigito(numero, decimais);
			decimais *= 10;
			}

					for (int i = 0; i < vet.length; i++) {
						if (vet[i] == 0) {
							cont[0]++;
						}
						if (vet[i] == 1) {
							cont[1]++;
						}
						if (vet[i] == 2) {
							cont[2]++;
						}
						if (vet[i] == 3) {
							cont[3]++;
						}
						if (vet[i] == 4) {
							cont[4]++;
						}
						if (vet[i] == 5) {
							cont[5]++;
						}
						if (vet[i] == 6) {
							cont[6]++;
						}
						if (vet[i] == 7) {
							cont[7]++;
						}
						if (vet[i] == 8) {
							cont[8]++;
						}
						if (vet[i] == 9) {
							cont[9]++;
						}
					}

		int aux = 0;
		int digito = 0;
		for (int i = 0; i < cont.length; i++) {
			if (cont[i] > aux) {
				aux = cont[i];
				digito = i;
			}
		}
		if (aux != 0) {
		System.out.print(" o numero " +digito);
		System.out.println(" Foi digitado " + aux + " vezes");
		}
	}

	// funções:
	static int contarDigitos(long numero) {
		int contador = 0;
		while (numero != 0) {
			numero = numero / 10;
			contador++;

		}
		return contador;

	}

	static long separaDigito(long numero, int y) {
		return numero / y % 10;
	}

}