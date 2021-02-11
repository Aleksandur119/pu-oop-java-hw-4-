import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class StartGpsCordinat extends Block {

	
	private Random randomXY=new Random();
	
	
	
	public StartGpsCordinat(int w, int h, int x, int y, Color c){
		super(w, h, x, y, c);
		
		int patternX[] = {0,0,7,7};
		int patternY[] = {0,7,0,7};
	
		
		int randomNumber =randomXY.nextInt(patternX.length);
			
		
		
		setX(w*patternX[randomNumber]);
		setY(w*patternY[randomNumber]);
		
		
		
	}

	@Override
	void render(Graphics g) {
		g.setColor(getColor());
		g.fill3DRect(getX(), getY(), getWidth(), getHeight(), true);
		
	}
	
	@Override
	void tick() {
		
	
		
		
		
	}
	
	
}
