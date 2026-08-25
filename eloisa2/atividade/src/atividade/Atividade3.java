package atividade;

public class Atividade3 extends Atividade2 {

	public static void main(String[] args) {
		int distancia = 420;
		int litros = 34;
		int consumoM = 0;
		int lcem = 0;
		
		consumoM = distancia/litros;
		lcem = 100/consumoM;
		
		System.out.println("consumo medio: "+consumoM+"\nLITROS PARA 100KM: "+lcem);
		
		

	}

}
