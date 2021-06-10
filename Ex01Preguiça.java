package br.com.generation.heranca.animais;
public class Ex01Preguiça extends Ex01Animal {
	public void som(){
		System.out.println("A preguiça: *grito*");
}
	public void sobe() {
		System.out.println("A preguiça está subindo....");
	}
	
	private String regioes;
	private String cor;
	private String pelagem;
	private String garras;
	private String velocidade;
	
	public String getRegioes() {
		return regioes;
	}
	public void setRegioes(String regioes) {
		this.regioes = regioes;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPelagem() {
		return pelagem;
	}
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	public String getGarras() {
		return garras;
	}
	public void setGarras(String garras) {
		this.garras = garras;
	}
	public String getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}
	
	
}
