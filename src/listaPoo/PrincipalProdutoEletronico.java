package listaPoo;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalProdutoEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		ProdutoEletronico produto = new ProdutoEletronico();
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Marca do produto: ");
		produto.marca = ler.next().toUpperCase();
		System.out.print("\nModelo do produto: ");
		produto.modelo = ler.next().toUpperCase();
		System.out.print("\nTipo do produto: ");
		produto.tipo = ler.next().toUpperCase();
		System.out.print("\nPreço do produto: ");
		produto.preco = ler.nextDouble();
		System.out.print("\nCor do produto: ");
		produto.cor = ler.next().toUpperCase();
		
		
		System.out.print("\nVocÊ deseja aumentar o volume?\n\t[S] - SIM | [N] - NÃO ");
		produto.reguladorMais = ler.next().toUpperCase().charAt(0);
		produto.aumentarVolume();
		
		System.out.print("\nVocê desejea abaixar o volume?\n\t[S] - SIM | [N] - NÃO ");
		produto.reguladorMenos = ler.next().toUpperCase().charAt(0);
		produto.abaixarVolume();
				
		System.out.println("\nVocê deseja desligar o aparelho? \n\t[S] - SIM | [N] - NÃO");
		produto.botao =ler.next().toUpperCase().charAt(0);
		
		produto.desligar();
		
		ler.close();
	}

}
