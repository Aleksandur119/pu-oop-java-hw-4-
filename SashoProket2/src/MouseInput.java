import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class MouseInput implements MouseListener {

	Board board;
	
	public MouseInput(Board board) {
		this.board=board;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		
		
		int mouseX =e.getX();
		int mouseY =e.getY();
		board.getBoard()[board.getPlayer().getY()/board.getSize()][board.getPlayer().getX()/board.getSize()].setCcolor(new Color(201, 201, 0));
			int newPositionX=0,newPositionY=0;
			//right
			if(mouseX>=board.getPlayer().getX()+board.getSize()&&mouseX<=board.getPlayer().getX()+(board.getSize()*2) ){
				//board.getPlayer().setX(board.getPlayer().getX()+board.getSize());
				newPositionX=board.getPlayer().getX()+board.getSize();
				newPositionY=board.getPlayer().getY();
				
			}
			//left
			else if(mouseX<=board.getPlayer().getX()&&mouseX>=board.getPlayer().getX()-(board.getSize()*2)) {
				//board.getPlayer().setX(board.getPlayer().getX()-board.getSize());
				newPositionX=board.getPlayer().getX()-board.getSize();
				newPositionY=board.getPlayer().getY();
				
			}
			//down
			else if(mouseY>=board.getPlayer().getY()+board.getSize()&&mouseY<=board.getPlayer().getY()+(board.getSize()*2)) {
				//board.getPlayer().setY(board.getPlayer().getY()+board.getSize());
				newPositionX=board.getPlayer().getX();
				newPositionY=board.getPlayer().getY()+board.getSize();
			}
			//up
			else if(mouseY<=board.getPlayer().getY()&&mouseY>=board.getPlayer().getY()-(board.getSize())) {
				//board.getPlayer().setY(board.getPlayer().getY()-board.getSize());
				newPositionX=board.getPlayer().getX();
				newPositionY=board.getPlayer().getY()-board.getSize();
				
			}
			
			
			
			
			if(chance()&&getBlock(newPositionY,newPositionX).getColor()!=Color.yellow) {
				getBlock(newPositionY,newPositionX).setCcolor(Color.blue);
			}else {
				board.getPlayer().setX(newPositionX);
				board.getPlayer().setY(newPositionY);
			}
			
			
			
			
			
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	Random random =new Random();
	
	private boolean chance()
	{
		
	  float chance = random.nextFloat();

	  if (chance <= 0.20f)
	    return true;
	  else 
		  return false;
	  
	}
	private Block getBlock(int x,int y) {
		return board.getBoard()[x/board.getSize()][y/board.getSize()];
	}
	
	

}
