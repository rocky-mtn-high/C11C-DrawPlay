
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Mouse {
	private static final int BODY_LENGTH = 50;
	private static final int BODY_HEIGHT = 20;
	private static final int TAIL_LENGTH = 40;
	public void draw(Graphics g, int mouseX, int mouseY)
  
    
	// ears are about 1/5 the size of the head
	private static final int EAR_SIZE = HEAD_DIMENSION/5;
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.gray);
		g2.fillOval(mouseX, mouseY, BODY_LENGTH, BODY_HEIGHT);
		int x = mouseX + BODY_LENGTH;
		int y = mouseY + BODY_HEIGHT/2;
		int x2 = x + TAIL_LENGTH;
		g2.drawLine(x, y, x2, y);
		// text appears below mouse body, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("Squeak", mouseX, mouseY+BODY_HEIGHT+10);	\
        // Add ears
	g2.setColor(Color.LIGHT_GRAY);
	// Draw left side of left ear
	x = catX + HEAD_DIMENSION/5;
	x2 = x + EAR_SIZE/2;
	y = catY + HEAD_DIMENSION/5;
	y2 = y - EAR_SIZE;
	g2.drawLine(x, y, x2, y2);
	// Draw right side of right ear
	// Note that we reverse x/x2 and y/y2
	x = x2 + EAR_SIZE/2;
	g2.drawLine(x2, y2, x, y);
	// Draw left side of right ear
	x += HEAD_DIMENSION/5;
	x2 = x + EAR_SIZE/2;
	g2.drawLine(x2, y2, x, y);
	// Draw right side of right ear
	x = x2 + EAR_SIZE/2;
	g2.drawLine(x2, y2, x, y);
	}
}