import javax.swing.JApplet;
import java.awt.*;

	public class AppletHello extends JApplet {
		public void paint (Graphics gDC) {
			Font font = new Font ("SansSerif", Font.BOLD, 36);
			gDC.setFont (font);
			gDC.drawString ("Hello!", 110, 110);
}
}