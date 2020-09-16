package listaPoo;



public class Funcionario {


	public String nomeFuncionario;
	public int idFuncionario;
	public String departamentoFuncionario;
	public String cargoFuncionario;
	public double salarioFuncionario;
	public double salarioExtra;
	public double salarioFinal;
	public int cargaHoraria;
	public int horaExtra;
	public char extra;
	
	public final double HORA_EXTRA = 10;
	public final int DIAS_TRABALHADOS = 25;
	
	
	public void trabalhar() {
		System.out.println("O funcionário está trabalhando...");
	}
	
	public double calcularSal() {
		double salario = this.salarioFuncionario;
		double valorExtra = this.HORA_EXTRA;
		int cargaHora = this.cargaHoraria;
		int dias = this.DIAS_TRABALHADOS;
		int horaExtra = this.horaExtra;
		double salFinal = this.salarioFinal;
		
		if(cargaHora > 8) {
			salFinal = ((salario * cargaHora)*dias)+ (valorExtra*horaExtra);
			System.out.print("\nSalario mensal + extra: R$"+salFinal);
		}
		else {  
			salFinal = (salario * cargaHora)*dias;
			System.out.print("\nSalario mensal: R$"+salFinal);
		}
		return this.salarioExtra;
	}
	
	
	
}
