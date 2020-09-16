package listaPoo;

public class Cliente {
	
	/*
	 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
	 *  em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.

	 */
	public String nomeCliente;
	public String cpfCliente;
	public int idadeCliente;
	public char sexoCliente;
	
	public final int ANO_ATUAL=2020;
	public void mostrarCliente() {
		System.out.println("\n\n-----------------------------------");
		System.out.print("Nome cliente: "+nomeCliente.toUpperCase());
	
		System.out.print("\nCPF cliente: "+cpfCliente);
		
		System.out.print("\nIdade cliente: "+(ANO_ATUAL-idadeCliente));
		
		System.out.print("\nSexo cliente: "+sexoCliente);
		
		
		
	}
	

}
