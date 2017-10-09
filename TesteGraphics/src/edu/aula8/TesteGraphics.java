package edu.aula8;

import javax.swing.JFrame;

public class TesteGraphics {

	private Desenho des;

	public TesteGraphics() { 
		JFrame janela = new JFrame("Teste Graphics");
		des = new Desenho();
		janela.setContentPane( des );
		
		janela.setSize(640, 480);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void atualizar() { 
		while(true) { 
			des.repaint();

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		TesteGraphics teste = new TesteGraphics();
		teste.atualizar();
	}
	
}
