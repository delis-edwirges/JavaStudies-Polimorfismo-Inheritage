package br.com.generation.heranca.animais;
public class ImprimirAnimais{
		public static void main(String[] args) {
		Ex02TestaAnimais t1 = new Ex02TestaAnimais();
		
		t1.som(new Ex01Cachorro());
		t1.som(new Ex01Cavalo());
		t1.som(new Ex01Preguiça());
		System.out.println();
		t1.corre(new Ex01Cachorro());
		t1.corre(new Ex01Cavalo());
		t1.sobe(new Ex01Preguiça());
		
		
	}
}
