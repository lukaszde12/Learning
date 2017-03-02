import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

	public class Aplikacja extends JFrame implements ActionListener {
		private JTextArea textArea;
		public Aplikacja() {
			super();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(320, 200);
			setTitle("Edytor tekstu");
			setLayout(new GridLayout(0, 1));
			
			JMenuBar menuBar = new JMenuBar();
			JMenu menu = new JMenu("Plik");
			
			JMenuItem miOtworz = new JMenuItem("Otwórz");
			miOtworz.addActionListener(this);
			miOtworz.setActionCommand("Open");
			
			JMenuItem miZapisz = new JMenuItem("Zapisz jako");
			miZapisz.addActionListener(this);
			miZapisz.setActionCommand("Save");
			
			JMenuItem miZamknij = new JMenuItem("Zamknij");
			miZamknij.addActionListener(this);
			miZamknij.setActionCommand("Close");
			
			menu.add(miOtworz);
			menu.add(miZapisz);
			menu.add(new JSeparator());
			menu.add(miZamknij);
			
			textArea = new JTextArea();
			add(textArea);
			menuBar.add(menu);
			setJMenuBar(menuBar);
			setVisible(true);
}
		
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if ("Close".equals(command)){
				dispose();
	}	
			
			else if("Open".equals(command)){
				JFileChooser fc = new JFileChooser();
				if(fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
					open(fc.getSelectedFile());
				}
			}
			else if ("Save".equals(command)){
				JFileChooser fc = new JFileChooser();
				if(fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
					save(fc.getSelectedFile());
				}
			}
		}
		
		public void open(File file) {
			FileInputStream fin = null;
			try{
				fin = new FileInputStream(file);
			}
			catch(FileNotFoundException e){
				JOptionPane.showMessageDialog(this, "B³¹d przy otwieraniu pliku.",
						"B³¹d", JOptionPane.ERROR_MESSAGE);
				return;
			}
			BufferedReader inbr = new BufferedReader(new InputStreamReader(fin));
			textArea.setText("");
			String line = "";
			try{
				while ((line = inbr.readLine()) != null){
					textArea.append(line + '\n');
				}
			}
			catch(IOException e){
				JOptionPane.showMessageDialog(this, "B³¹d wejœcia-wyjœcia.",
						"B³¹d", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		public void save(File file) {
			FileOutputStream fout = null;
			try{
				fout = new FileOutputStream(file);
			}
			catch(FileNotFoundException e){
				JOptionPane.showMessageDialog(this, "B³¹d przy zapisie pliku.",
						"B³¹d", JOptionPane.ERROR_MESSAGE);
				return;
			}
			DataOutputStream out = new DataOutputStream(fout);
			try{
				String line = textArea.getText();
				out.writeBytes(line + '\n');
			}
			catch(IOException e){
				JOptionPane.showMessageDialog(this, "B³¹d wejœcia-wyjœcia.",
						"B³¹d", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		public static void main(String args[]) {
			// kod metody main
}
}