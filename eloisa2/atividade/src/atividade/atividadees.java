package atividade;

public class atividadees {

	
		
		/*
		 * metodo que calcula a soma de dois valores inteiros 
		 * @param numA primeiro valor da soma 
		 * @para numB segundo valor da soma 
		 * @return resultado da soma 
		 */
	
	public int somar (int numA, int numB) {
		
		return numA + numB;
	}
	
	/*
	 * método principal da aplicaçao
	 * @param argumento de entrada da aplicaçao
	 */
	public static void main (String [] args) {
		atividadees resultado = new atividadees ();
		
		System.out.println(resultado.somar(2,3));
	}
}
