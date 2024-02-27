package br.com.fiap;

public class Teste {
	
	public static void main(String[] args) {
		Televisor tv = new Televisor();
		tv.volume = 10;
		tv.canal = 160;
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.mostrar();
		
		ArCondicionado ac = new ArCondicionado();
		ac.temperatura = 23;
		ac.modo = "Verão";
		ac.aumentarTemperatura();
		ac.trocarModo("Inverno");
		ac.mostrar();
	}

}
