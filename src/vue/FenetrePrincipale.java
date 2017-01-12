package vue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controleur.ControleurPartie;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Font;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class FenetrePrincipale extends JFrame {

//	private static FenetrePrincipale fenetrePrincipale;
	private JButton btnSortie;
	private JButton btnAide;
	private JButton btnPartie;
//	public static FenetrePrincipale getFenetrePrincipale() {
//		return fenetrePrincipale;
//	}

//	public static void setFenetrePrincipale(FenetrePrincipale fenetrePrincipale) {
//		FenetrePrincipale.fenetrePrincipale = fenetrePrincipale;
//	}

	private JPanel overview;

	public FenetrePrincipale(){
		super();
		this.getContentPane().setBackground(new Color(244, 164, 96));
		this.setTitle("PANDOCREON DIVINAE");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(640, 700));
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		overview = new JPanel();
		overview.setOpaque(false);

		JPanel paneImage = new JPanel();
		paneImage.setLayout(new BorderLayout());
		this.getContentPane().add(paneImage, BorderLayout.WEST);


		JLabel lblPandocreonDivinae = new JLabel(
				"<html><div style='text-align: center;'>PANDOCREON<br/>DIVINAE</div></html>");
		lblPandocreonDivinae.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 36));
		lblPandocreonDivinae.setHorizontalAlignment(JLabel.CENTER);
		lblPandocreonDivinae.setVerticalAlignment(JLabel.CENTER);
		lblPandocreonDivinae.setBackground(new Color(244, 164, 96));
		lblPandocreonDivinae.setOpaque(true);
		paneImage.add(lblPandocreonDivinae, BorderLayout.EAST);

		GridBagLayout gridBagLayout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		gridBagLayout.columnWeights = new double[] { 0.7, 0.3 };
		gridBagLayout.rowWeights = new double[] { 0.1, 0.1, 0.1 };
		overview.setLayout(gridBagLayout);

		btnPartie = new JButton("Partie");
		gbc.insets = new Insets(0, 0, 5, 0);
		gbc.gridx = 1;
		gbc.gridy = 0;
		overview.add(btnPartie, gbc);
		

		btnAide = new JButton("Aide");
		gbc.insets = new Insets(0, 0, 5, 0);
		gbc.gridx = 1;
		gbc.gridy = 1;
		overview.add(btnAide, gbc);

		btnSortie = new JButton("Sortie");
		gbc.gridx = 1;
		gbc.gridy = 2;
		overview.add(btnSortie, gbc);
		

		this.getContentPane().add(overview, BorderLayout.EAST);

		JLabel lblImage = new JLabel();
		try {
			BufferedImage myPicture = ImageIO
					.read(getClass().getClassLoader().getResourceAsStream("res/jpeg/" + "picture.jpg"));
			ImageIcon icon = new ImageIcon(
					myPicture.getScaledInstance(myPicture.getWidth(), myPicture.getHeight(), myPicture.SCALE_SMOOTH));
			lblImage.setIcon(icon);
			lblImage.setHorizontalAlignment(JLabel.CENTER);
			lblImage.setVerticalAlignment(JLabel.CENTER);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.getContentPane().add(lblImage, BorderLayout.CENTER);

//		this.getContentPane().addContainerListener(new ContainerListener() {
//
//			@Override
//			public void componentRemoved(ContainerEvent e) {
//				// TODO Auto-generated method stub
//				overview.setVisible(true);
//				lblPandocreonDivinae.setVisible(true);
//				lblImage.setVisible(true);
//			}
//
//			@Override
//			public void componentAdded(ContainerEvent e) {
//				// TODO Auto-generated method stub
//				overview.setVisible(false);
//				lblPandocreonDivinae.setVisible(false);
//				lblImage.setVisible(false);
//			}
//		});
		this.setVisible(true);
	}

	
	public JButton getBtnSortie() {
		return btnSortie;
	}

	public JButton getBtnAide() {
		return btnAide;
	}

	public JButton getBtnPartie() {
		return btnPartie;
	}

	public static void main(String[] args) {
//		FenetrePrincipale fenetre = new FenetrePrincipale();
//		fenetre.setVisible(true);
//		fenetrePrincipale = fenetre;
		
		ControleurPartie controleurPartie = new ControleurPartie();
	}
}
