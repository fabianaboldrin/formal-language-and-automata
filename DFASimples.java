public class DFASimples {

	public static void main(String args[]) {
		String entrada;
		int estado = 0;
		int posicao = 0;
		
		entrada = args[0];
		
		while(posicao < entrada.length()){
			printCI(entrada, posicao, estado);
			
			char elemento = entrada.charAt(posicao);
			
			if(estado == 0 && elemento == '0') {
				estado = 0;
			} else if(estado == 0 && elemento == '1') {
				estado = 1;
			} else if(estado == 1 && elemento == '0') {
				estado = 1;
			} else if(estado == 1 && elemento == '1') { 
				estado = 0;
			}
			
			posicao++;
		}
		printCI(entrada, posicao, estado);
		
		if(estado == 1){
			System.out.println("Aceita");
		} else if(estado == 0){
			System.out.println("Rejeita");
		}
	}
	
	public static void printCI(String entrada, int posicao, int estado){
		System.out.print(entrada.substring(0, posicao));
		System.out.print("[q"+estado+"]");
		System.out.println(entrada.substring(posicao));
	}
}