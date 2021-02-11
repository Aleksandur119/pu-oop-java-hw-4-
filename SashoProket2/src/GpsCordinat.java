import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class GpsCordinat extends Block{

	private StartGpsCordinat player;

	GpsCordinat(int w, int h, int x, int y, Color c,StartGpsCordinat player) {
		super(w, h, x, y, c);
		// TODO Auto-generated constructor stub
		this.player=player;
	}

	@Override
	void render(Graphics g) {
		g.setColor(getColor());
		g.fill3DRect(getX(), getY(), getWidth(), getHeight(), true);
		
	}
	boolean flag;

	@Override
	void tick() {
		if(player.getX()==this.getX()&&player.getY()==this.getY()) {
			JOptionPane.showMessageDialog(null,"You win!!!");
			System.exit(1);
		}
		
	}
	public static void spawnGpsCordinatTeritory(Graphics g,int size,StartGpsCordinat player,GpsCordinat teritory[]) {
		int coordinateX[]= {6 ,1 ,5, 1, 3,6,2,6};
		int coordinateY[]= {0, 1, 2, 3, 3,4,5,7};
		//GpsCordinat teritory[] =new GpsCordinat[coordinateY.length];
		for(int i=0;i<teritory.length;i++) {
			teritory[i]=new GpsCordinat(size,size,size*coordinateX[i],size*coordinateY[i],Color.green,player);
			teritory[i].render(g);
		}
	}

}
