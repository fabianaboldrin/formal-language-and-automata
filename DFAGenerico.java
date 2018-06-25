public class DFAGenerico {
	static int[] aceitacao = {1};
	// estados =  0, 1, 2...
	// alfabeto = 0,1
	static int[][] transicao = {{0,1}, {1,0}};
	
	static int estadoInicial = 0;
	
	public static void main(String args[]) {
		String entrada = args[0];
		int estado = estadoInicial;
		int posicao = 0;
		
		while(posicao < entrada.length()){
			printCI(entrada, posicao, estado);
			
			char elemento = entrada.charAt(posicao);
			
			int elementoInt = Integer.parseInt(elemento+"");
			
			estado = transicao[estado][elementoInt];
			
			posicao++;
		}
		printCI(entrada, posicao, estado);
		
		boolean aceita = false;
		for(int i:aceitacao) {
			if(estado == i) aceita = true;
		}
		
		if(aceita){
			System.out.println("Aceita");
		} else {
			System.out.println("Rejeita");
		}
	}
	
	public static void printCI(String entrada, int posicao, int estado){
		System.out.print(entrada.substring(0, posicao));
		System.out.print("[q"+estado+"]");
		System.out.println(entrada.substring(posicao));
	}
}