
public class Jogo {
	
	public String logicaMorto(int vizinhos){
		String str = "0";
		if(vizinhos == 3){
			str = "X";
		}
		return str;
	}
	
	public String logicaVivo(int vizinhos){
		String str = "X";
		
		if(vizinhos < 2){
			str = "0";
		}else if(vizinhos > 3){
			str = "0";
		}
		return str;
	}
	
	public String[][] inicializaTabuleiroTeste(){
		String[][] tabuleiro = {{"X", "X", "X", "X", "X"}, {"X", "X", "O", "O", "X"}, {"X", "0", "0", "O", "X"}, {"X", "X", "X", "X", "X"}};
		
		return tabuleiro;
	}
	
	
	public void resultado(String[][] tabuleiro){
		if(tabuleiro != null){
			for(int i=0; i<4; i++){
				for(int j=0; j<5; j++){
					System.out.print(tabuleiro[i][j] + " ");
				}
				System.out.println("\n");
			}
		}
	}

}
