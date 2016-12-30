package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import cartes.Carte;
import cartes.TypeCarte;
import cartes.croyant.Croyant;
import cartes.guideSpirituel.GuideSpirituel;
import joueurs.JoueurVirtuel;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class TestFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrame frame = new TestFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		GuideSpirituel carte = new GuideSpirituel();
		JoueurVirtuel joueur= new JoueurVirtuel("merdre");
		carte.setProprietaire(joueur);
		
		carte
		.setPropriete(new Propriete(Dogme.HUMAIN, Dogme.CHAOS, Origine.NUIT));
		
		carte.setTypeCarte(TypeCarte.guideSpirituel);
		carte.setCapacite("abc");
		carte.setNom("xyz");
		carte.setNbCarteCroyantRattaches(5);
		VueCarte vueCarte = new VueCarte(carte);
		vueCarte.setBorder(BorderFactory.createLineBorder(Color.RED));
		add(vueCarte);
		
		
	}

}
