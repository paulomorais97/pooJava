package listaPoo;



public class Aviao {
		
	
	/*
	 * Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe,	
	 *  em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
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
		System.out.print("Compania a�rea: "+companiaArea);
		System.out.print("\nCidade de partida: "+pontoSaida);
		System.out.print("\nCidade de destino: "+destinoVoo);
		System.out.print("\nN�mero total de passageiros: "+numeroPassageiros);
		}
		else if(conf=='N') {
			System.out.println("Passagem cancelada...");
		}
		else {
			System.out.println("Op��o Inv�lida!");
		}
	}
	
	public void decolar() {
		System.out.println("Aviv�o decolando...");
	}
	
	
}
