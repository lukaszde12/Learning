import javax.swing.JApplet;
	import java.awt.*;
	public class AppletFonts extends JApplet {
	Font fontSerif, fontSansSerif, fontMonospaced,
	fontDialog, fontDialogInput;
	public void init() {
	fontSerif = new Font("Serif", Font.BOLD, 36);
	fontSansSerif = new Font("SansSerif", Font.BOLD, 36);
	fontMonospaced = new Font("Monospaced", Font.BOLD, 36);
	fontDialog = new Font("Dialog", Font.BOLD, 36);
	fontDialogInput = new Font("DialogInput", Font.BOLD, 36);
	}
	public void paint (Graphics gDC) {
		gDC.setFont(fontSerif);
		gDC.drawString("Serif", 110, 30);
		gDC.setFont(fontSansSerif);
		gDC.drawString("SansSerif", 110, 70);
		gDC.setFont(fontMonospaced);
		gDC.drawString("Monospaced", 110, 110);
		gDC.setFont(fontDialog);
		gDC.drawString("Dialog", 110, 150);
		gDC.setFont(fontDialogInput);
		gDC.drawString("DialogInput", 110, 190);
		}
		}