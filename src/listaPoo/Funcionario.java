package listaPoo;



public class Funcionario {


	public String nomeFuncionario;
	public int idFuncionario;
	public String departamentoFuncionario;
	public String cargoFuncionario;
	
	public String hora;
	
	
	
	public void almocar() {
		String horaAlmoco = this.hora;
		if(horaAlmoco == "12h") {
			System.out.println("Hora do almoço...");
		}
		else if(horaAlmoco == "13h") {
			System.out.println("Hora de voltar ao trabalhar...");
		}
			
	}
	public void trabalhar() {
		System.out.println("O funcionário está trabalhando...");
		
		

	}
	
	
	
}
