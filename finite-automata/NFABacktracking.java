public class NFABacktracking{
	static int [] aceitacao  = {2};
	static int estadoInicial = 0;
	
	//estados = 0,1,2,3...
	//alfabeto = 0,1
	
	static int[][][] transicao = {{{0,1}, {0}},
			 					  {{}, 	  {2}},
								  {{}, 	  {}}};
	
	public static void main(String args[]){
		String entrada = args[0];
		
		int[] estados = {estadoInicial};
		
		int[] estadosFinais = testa(entrada, estados, 0);
		
		if(aceita(estadosFinais)){
			System.out.println("Aceita");
		} else{
			System.out.println("Rejeita");
		}
	}
	
	private static int[] testa(String entrada, int[] estados, int posicao){
		if(posicao == entrada.length()){
			printCI(entrada, estados[0], posicao);
			if(aceita(estados)){
				return estados;
			}
			System.out.println("<<backtrack>> Fim da cadeia");
			return null;
		}
		int elemento = Integer.parseInt(entrada.substring(posicao, posicao+1));
		
		for(int i:estados){
			printCI(entrada, i, posicao);
			
			int[] novosEstados = transicao[i][elemento];
			if(novosEstados.length == 0){
				//printCI(entrada, novosEstados[0], posicao);
				System.out.println("<<backtrack>> Sem opções");
				return null;
			}
			int[] transicoes = testa(entrada, novosEstados, posicao+1);
			if(transicoes != null) return transicoes;
		}
		return null;
	}
	
	private static boolean aceita(int[] estados){
		if(estados == null) return false;
		for(int i:estados){
			for(int j:aceitacao){
				if(i == j){
					return true;
				}
			}
		}
		return false;
	} 
	
	private static void printCI(String entrada, int estado, int posicao){
		System.out.print(entrada.substring(0, posicao));
		System.out.print("[q"+estado+"]");
		System.out.println(entrada.substring(posicao));
	}
}







