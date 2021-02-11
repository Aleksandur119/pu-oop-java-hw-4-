import java.awt.Color;
import java.awt.Graphics;

public class UnknownTeritory extends Block {

	

	UnknownTeritory(int w, int h, int x, int y, Color c) {
		super(w, h, x, y, c);
		
	}

	@Override
	void render(Graphics g) {
		g.setColor(getColor());
		g.fill3DRect(getX(), getY(), getWidth(), getHeight(), true);
		
	}

	@Override
	void tick() {
		
		
	}
	
	public static void spawnUnknowsTeritory(Graphics g,int size) {
		int coordinateY[]= {1 ,2 ,5, 5, 6};
		int coordinateX[]= {4, 7, 0, 7, 4};
		UnknownTeritory teritory[] =new UnknownTeritory[5];
		for(int i=0;i<teritory.length;i++) {
			teritory[i]=new UnknownTeritory(size,size,size*coordinateX[i],size*coordinateY[i],Color.blue);
			teritory[i].render(g);
		}
	}

}
