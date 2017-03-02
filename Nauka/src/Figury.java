import javax.swing.JApplet;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

		public class Figury extends JApplet implements MouseListener {
			private int tabX[], tabY[];
			private int count;
			private Color colors[];
			private Random r;
			public void init() {
				count = 0;
				tabX = new int [100];
				tabY = new int [100];
				colors = new Color[100];
				r = new Random();
					addMouseListener (this);
				}
				public void paint (Graphics gDC) {
						for (int i = 0; i < count; i++){
								gDC.setColor(colors[i]);
								gDC.fillOval(tabX[i] - 10, tabY[i] - 10, 20, 20);
						}
				}
					public void mousePressed (MouseEvent evt) {
						int x = evt.getX();
						int y = evt.getY();
						if(count < tabX.length){
							tabX[count] = x;
							tabY[count] = y;
							colors[count] = new Color (r.nextInt());
							count++;
						}
						repaint();
													}
					public void mouseExited (MouseEvent evt){}
					public void mouseEntered (MouseEvent evt){}
					public void mouseReleased (MouseEvent evt){}
					public void mouseClicked (MouseEvent evt){}
		}