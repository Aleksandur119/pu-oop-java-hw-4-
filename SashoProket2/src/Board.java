import java.awt.Color;
import java.awt.Graphics;

public class Board {

	private int size;
	private StartGpsCordinat player;
	

	Board(int size) {
		this.size = size;
		player = new StartGpsCordinat(size, size, 0, 0, Color.yellow);
		init();
	}

	private final Block b[][] = new Square[8][8];

	public void tick() {
		player.tick();
		
		
	}

	public void render(Graphics g) {// render all blocks on screen

		for (int i = 0; i < b.length; i++) {

			for (int j = 0; j < b[i].length; j++) {

				

				b[j][i].render(g);
			}

		}
		
		player.render(g);

	}

	public StartGpsCordinat getPlayer() {
		return player;
	}
	private void init() {
		for (int i = 0; i < b.length; i++) {

			for (int j = 0; j < b[i].length; j++) {

				b[j][i] = new Square(size, size, size * i, size * j, Color.pink);

				
			}

		}
		
	}

	public void setPlayer(StartGpsCordinat player) {
		this.player = player;
	}

	public int getSize() {
		return size;
	}

	public Block[][] getBoard() {
		return b;
	}

	
	
	
	

}
