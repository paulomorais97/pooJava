package listaPoo;

public class ProdutoEletronico {
	/*
	 * marca
modela
tipo
preço
cor
	 */

	public String marca;
	public String modelo;
	public double preco;
	public String cor;
	public String tipo;
	public char botao;
	public boolean desligar=false;
	public char reguladorMais;
	public char reguladorMenos;
	public int volumeAtual = 50;
	public int volume =10;
	
	
	
	public void desligar()  {
		
		
		if(botao == 'S') {
			desligar = true;
		System.out.print("\nO aparelho irá desligar");
		}
		else if(botao == 'N') {
			desligar=false;
			System.out.print("\nO aparelho continuará ligado.");
		}
	}
	
	
	public void aumentarVolume() {
		int volume = this.volumeAtual;
		
		if(reguladorMais == 'S') {
			volume=volume+this.volume;
			System.out.print("\nVolume atual: "+volume);
		}
		else  {
			System.out.print("\nVolume atual: "+ volume);
		}
		
	}
	public void abaixarVolume() {
		int volume = this.volumeAtual;
		if(reguladorMenos == 'S') {
			volume=volume-this.volume;
			System.out.print("\nVolume atual: "+volume);
		}else {
			System.out.print("\nVolume atual: "+ volume);
		}
	}
	
}
