import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.Point;

public class GUI {

	private JFrame frmGeneratorTreningw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmGeneratorTreningw.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}
	
	String[] listaSlow1 = {"linie zakr�t�w", "st�jka na stoj�co", "st�jka na siedz�co", "kraw�niki", "wheelie", "hamowanie"};
	String[] listaSlow2 = {"niskie siod�o", "wysokie siod�o", "ty�ek nisko nad ko�em", "jazda na stoj�co", "koncentracja"};
	String[] listaSlow3 = {"zmiany bieg�w przed zakr�tem", "podjazd na piony", "bunny hop", "endo", "pr�dko�� w zakr�cie", "u�lizgi ko�a w zakr�cie"};
	String[] listaSlow4 = {"hamowanie bokiem", "pionowe �ciany", "schody", "jazda na przednik kole", "jazda do ty�u"};
	
int lista1Dlugosc = listaSlow1.length;
int lista2Dlugosc = listaSlow2.length;
int lista3Dlugosc = listaSlow3.length;
int lista4Dlugosc = listaSlow4.length;

int rnd1 = (int) (Math.random() * lista1Dlugosc);
int rnd2 = (int) (Math.random() * lista2Dlugosc);
int rnd3 = (int) (Math.random() * lista3Dlugosc);
int rnd4 = (int) (Math.random() * lista4Dlugosc);

String zdanie = listaSlow1[rnd1] + " + " + listaSlow2[rnd2] + " + " + listaSlow3[rnd3] + " + " + listaSlow4[rnd4];

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGeneratorTreningw = new JFrame();
		frmGeneratorTreningw.setTitle("Generator trening\u00F3w");
		frmGeneratorTreningw.setResizable(false);
		frmGeneratorTreningw.setBounds(100, 100, 272, 196);
		frmGeneratorTreningw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeneratorTreningw.getContentPane().setLayout(null);
		
		JButton btnGenerujTrening = new JButton("Generuj trening!");
		btnGenerujTrening.setBorderPainted(false);
		btnGenerujTrening.setHorizontalTextPosition(SwingConstants.CENTER);
		btnGenerujTrening.setToolTipText("Kliknij mnie!");
		btnGenerujTrening.setIcon(new ImageIcon("C:\\Users\\a044970\\Desktop\\bikeSC.jpg"));
		btnGenerujTrening.setForeground(Color.WHITE);
		btnGenerujTrening.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Dzi� dorzuc� nast�puj�ce skilsy do treningu: " + zdanie);
			}
		});
		btnGenerujTrening.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGenerujTrening.setBounds(0, 0, 270, 170);
		frmGeneratorTreningw.getContentPane().add(btnGenerujTrening);
	}
}
