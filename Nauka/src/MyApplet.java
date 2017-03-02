import javax.swing.JApplet;
import java.awt.*;

	public class MyApplet extends JApplet {
		int tabX[] = {30, 40, 60, 40, 30, 20, 0, 20, 30};
		int tabY[] = {220, 240, 250, 260, 280, 260, 250, 240, 220};
			public void paint (Graphics gDC) {
				Color color1 = Color.red;
				for(int i = 0; i < 30; i++){
					gDC.setColor (color1);
					color1 = new Color (color1.getRed() - 8, color1.getGreen(),
							color1.getBlue());
					gDC.drawLine (235 + i * 3, 20, 325 - i * 3, 200);
					gDC.setColor(Color.green);
					gDC.drawOval (60 + i * 2, 100 - i * 2, 150 - i * 4, 50 - i * 4);
					gDC.setColor(Color.blue);
					gDC.drawOval (360 + i * 2, 100 - i * 2, 150 - i * 4, 50 - i * 4);
								}
				boolean flag = false;
					Color color2 = Color.green;
					Color color3 = Color.blue;
				for(int i = 0; i < 8; i++){
					gDC.setColor(color2);
					color2 = new Color (color2.getRed(), color2.getGreen() - 20,
							color2.getBlue() + 20);
					gDC.fillOval (i * 70, 300, 50, 50);
					gDC.fillOval (50 + i * 70, 300, 20, 50);
				int tempTabX[] = new int[9];
				for (int j = 0; j < 9; j++){
					tempTabX[j] = tabX[j] + i * 72;
								}
				Polygon p = new Polygon(tempTabX, tabY, 9);
				gDC.setColor (color3);
						color3 = new Color (color3.getRed() + 25, color3.getGreen(),
						color3.getBlue() - 25);
				if (flag){
					gDC.drawPolygon(p);
						  }
				else{
					gDC.fillPolygon(p);
					}
				flag = !flag;
					}
			}
	}