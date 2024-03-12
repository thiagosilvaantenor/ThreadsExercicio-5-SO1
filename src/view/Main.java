package view;

import controller.ThreadPing;

public class Main {

	public static void main(String[] args) {
		ThreadPing uol = new ThreadPing("www.uol.com.br","UOL");
		ThreadPing terra = new ThreadPing("www.terra.com.br","Terra");
		ThreadPing google = new ThreadPing("www.google.com.br","Google");
		
		uol.start();
		terra.start();
		google.start();
		
	}

}
