package Aula_04_07;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class AnimaTela extends JFrame{
	
	//attributes
	private JPanel tela;
	private int fps = 1000/20; //50 --> taxa de atualização - 50 vezes por segundo
	private int ct;			   //contador
	private boolean anima = true;
	
	//methods
	public void iniciaAnimacao() {
		long prxAtualizacao = 0;
		
		while (anima) {
			
			if ( System.currentTimeMillis()> prxAtualizacao) {
				ct++;
				tela.repaint();
				
				prxAtualizacao = System.currentTimeMillis() + fps;
				
				if (ct == 100) {
					anima = false;
				}
			}
		}
	}
	
	public void AnimaTelaDesenho() {
			
			tela = new JPanel() {
				
				public void paintComponent( Graphics g) {
					
					g.setColor (Color.WHITE );
					g.fillRect (0,0, tela.getWidth(), tela.getHeight() );
					
					g.setColor(Color.BLUE);
					g.drawLine(0, 240 + ct, 640, 240 + ct);
					g.drawRect(10, 25 + ct, 20, 20);
					g.drawOval(30 + ct, 20, 40, 30);
					
					g.setColor(Color.YELLOW);
					g.drawLine(320 - ct, 0, 320 - ct, 480);
					g.drawRect(110, 125, 120 - ct, 120 - ct);
					g.drawOval(230, 220, 240 + ct, 230);
					
					g.setColor(Color.RED);
					g.drawString("Eu serei um ótimo Score!" + ct, 5, 10);
						
				}
			};
			
			getContentPane().add( tela );
			setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
			setSize( 640, 480 );
			setVisible (true);
			tela.repaint();
	}
	
	public static void main (String [] args) {
		
		AnimaTela anima = new AnimaTela();
		anima.iniciaAnimacao();
	}
}
