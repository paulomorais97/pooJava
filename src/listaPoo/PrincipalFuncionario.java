package listaPoo;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Funcionario func = new Funcionario();

		Scanner ler = new Scanner(System.in);
		
			System.out.print("Nome do funcionário[a]: ");
			func.nomeFuncionario = ler.next().toUpperCase();
			System.out.print("\nID do funcionário[a]: ");
			func.idFuncionario = ler.nextInt();
			System.out.print("\nQual departamento o[a] funcionário[a] pertence? ");
			func.departamentoFuncionario = ler.next().toUpperCase();
			System.out.print("\nQual cargo do[a] funcionário[a]?  ");
			func.cargoFuncionario = ler.next().toUpperCase();
			
			func.trabalhar();
			
			
			
		
			
			
			
		
		ler.close();
	}

}
