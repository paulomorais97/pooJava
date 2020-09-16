package listaPoo;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalCliente {

	public static void main(String args[] ) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		
		
		Cliente cliente1 = new Cliente();
		
		System.out.print("Digite seu nome: ");
		cliente1.nomeCliente = ler.nextLine().toUpperCase();
		
		System.out.print("Digite o seu CPF: ");
		cliente1.cpfCliente = ler.nextLine();
		
		System.out.println("Digite seu ano de nascimento: ");
		cliente1.idadeCliente =ler.nextInt();
		
		System.out.println("[M] - MASCULINO | [F] - FEMININO");
		System.out.print("Qual o sexo do[a] cliente: ");
		cliente1.sexoCliente = ler.next().toUpperCase().charAt(0);
		
		
		cliente1.mostrarCliente();
		
		ler.close();
	}
}
