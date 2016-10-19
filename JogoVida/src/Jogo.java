
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

}
