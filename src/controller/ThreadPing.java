package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ThreadPing extends Thread{
//	No Sistema Operacional Linux, o comando para realizar uma operação de ping com 10
//	iterações é ping -4 -c 10 <servidor>. Fazer uma aplicação Java que rode 3 Thread em S.O.
//	Linux fazendo operação de ping para os servidores UOL (www.uol.com.br), Terra
//	(www.terra.com.br) e Google (www.google.com.br). Cada thread deve ler a saída do ping
//	imprimindo, a cada iteração, o nome do servidor (usar fixo: UOL, Terra ou Google) e o tempo
//	daquela iteração. Ao fim, deve-se exibir o nome do servidor (usar fixo: UOL, Terra ou Google)
//	e o tempo médio obtido pela operação. Outros Sistemas Operacionais devem ser
//	descartados.
	
	private String url;
	private String nomeServidor;
	
	public ThreadPing(String url, String nomeServidor){
		this.url = url;
		this.nomeServidor = nomeServidor;
	}
	
	private String os() {
		return System.getProperty("os.name");
	}
	
	private void ping() throws IOException {
		String nomeSo = os();
		
		if(nomeSo.contains("Linux")) {
			String[] tempo;
			String aux = null;
			StringBuffer comando = new StringBuffer();
			comando.append("ping -4 -c 10 ");
			comando.append(url);

			Process p = Runtime.getRuntime().exec(comando.toString());
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			
			System.out.println(nomeServidor);
			
			String linha = buffer.readLine();
			while(linha != null) {
				if(linha.contains("time=")) {
					tempo = linha.split(":");
					aux = tempo[1];
					tempo = aux.split("time=");
					aux = tempo[1];
					System.out.println("Servidor: "+nomeServidor);
					System.out.println("Tempo desta iteracao: " + aux);
				}
				else if(linha.contains("avg")) {
					tempo = linha.split(" = ");
					aux = tempo[1];
					tempo = aux.split("/");
					aux = tempo[1];
					System.out.println("Servidor: "+nomeServidor);
					System.out.println("Tempo médio: " + aux);
					break;
				}
				linha = buffer.readLine();
			}
			
			
		} else{
			System.out.println("Erro, este projeto só funciona em sistemas operacionais Linux");
		}
	}
	
	@Override
		public void run() {
			try {
				ping();
				
			}catch(IOException e) {
				System.err.println(e.getMessage());
			}
		}

}
