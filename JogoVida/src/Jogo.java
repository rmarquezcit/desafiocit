
public class Jogo {

	private int x, y;
	private String tabuleiro[][];
	
	public Jogo(int x, int y){
		this.x = x;
		this.y = y;
		this.tabuleiro = new String[x][y];
		start();
	}
	
	public void start(){
		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				if(((i >= 1) && (i < x-1)) && ((j >= 1) && (j < y -1))){
					tabuleiro[i][j] = "X";
				}else{
					tabuleiro[i][j] = "0";
				}
				if((i == 1) && (j == 1)){
					tabuleiro[i][j] = "0";
				}

			}
		}
		
		continuar();
	}
	
	private void continuar(){
		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				if(tabuleiro[i][j].equals("X")){
					//verificar numero de vizinhos e aplicar logica vivo
				}else{
					//verificar numero de vizinhos e aplicar logica morto
				}

			}
		}
	}
	
	
	
	public void print(){
		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				System.out.print(tabuleiro[i][j]);
			}
			System.out.println();
		}
	}
	
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

}
