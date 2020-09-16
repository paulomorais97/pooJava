package listaPoo;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalAviao {
	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);
		Aviao aviao1 = new Aviao();
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Compania area do avi�o: ");
		aviao1.companiaArea = ler.next().toUpperCase();
		
		System.out.print("\nN�mero de passageiros no voo: ");
		aviao1.numeroPassageiros = ler.nextInt();
		System.out.print("\nUF de saida: ");
		aviao1.pontoSaida = ler.next();
		
		System.out.print("\nUF de destino: ");
		aviao1.destinoVoo = ler.next().toUpperCase();
	
		System.out.print("\nVoc� confirma a compra da passagem a�rea acima? ");
		aviao1.conf = ler.next().toUpperCase().charAt(0);
		
		
		aviao1.exibirEscala();
		aviao1.decolar();
		
		ler.close();
	}
}
