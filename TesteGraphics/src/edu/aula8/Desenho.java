package edu.aula8;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Desenho extends Container {
	private int bolaX = 0;
	private int bolaY = 0;
	private int bolaVelX = 1;
	private int bolaVelY = 1;
	private BufferedImage img;
	
	public Desenho() { 
		URL is = getClass().getResource("./soccer_ball.png");
		try {
			img = ImageIO.read( is );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		g.setColor( Color.BLUE );
		// g.fillOval( bolaX, 50, 50, 50 );
		// g.drawImage(img, bolaX, 50, null);
		g.drawImage(img, bolaX, bolaY, bolaX + 32, bolaY + 32, 0, 0, 124, 124, null);
		
		bolaX = bolaX + bolaVelX;
		bolaY = bolaY + bolaVelY;
		
		if (bolaX > getWidth()) { 
			bolaVelX = -1;
		}
		
		if (bolaX < 0) { 
			bolaVelX = 1;
		}
		
		if (bolaY > getHeight()) { 
			bolaVelY = -1;
		}
		
		if (bolaY < 0) { 
			bolaVelY = 1;
		}		
	}

}
