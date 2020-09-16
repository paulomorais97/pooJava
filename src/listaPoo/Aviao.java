package listaPoo;



public class Aviao {
		
	
	/*
	 * Crie uma classe avião e apresente os atributos e métodos referentes esta classe,	
	 *  em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações deste objeto no console.
	 */

	public String companiaArea;
	public String pontoSaida;
	public String destinoVoo;
	public int numeroPassageiros;
	public char conf;
	public boolean confirma = false;
	
	
	//String dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(aviao.dataVoo());
	
	public void exibirEscala() {
		
		if(conf=='S') {
		System.out.print("Compania aérea: "+companiaArea);
		System.out.print("\nCidade de partida: "+pontoSaida);
		System.out.print("\nCidade de destino: "+destinoVoo);
		System.out.print("\nNúmero total de passageiros: "+numeroPassageiros);
		}
		else if(conf=='N') {
			System.out.println("Passagem cancelada...");
		}
		else {
			System.out.println("Opção Inválida!");
		}
	}
	
	public void decolar() {
		System.out.println("Avivão decolando...");
	}
	
	
}
