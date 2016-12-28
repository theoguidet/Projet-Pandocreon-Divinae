package vue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controleur.ControleurPartie;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;


public class FenetrePrincipale extends JFrame {
	public FenetrePrincipale() {
		
//		setExtendedState(MAXIMIZED_BOTH);
		setTitle("PANDOCREON DIVINAE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(640, 700));
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWeights = new double[]{0.7, 0.3};
		gridBagLayout.rowWeights = new double[]{0.1, 0.1, 0.1};
		getContentPane().setLayout(gridBagLayout);
		
		JButton btnPartie = new JButton("Partie");
		btnPartie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				(new ControleurPartie()).commencer();
			}
		});
		
		GridBagConstraints gbc_btnPartie = new GridBagConstraints();
		gbc_btnPartie.insets = new Insets(0, 0, 5, 0);
		gbc_btnPartie.gridx = 1;
		gbc_btnPartie.gridy = 0;
		getContentPane().add(btnPartie, gbc_btnPartie);
		
		JPanel paneImage = new JPanel();
		GridBagConstraints gbc_paneImage = new GridBagConstraints();
		gbc_paneImage.gridheight = 3;
		gbc_paneImage.insets = new Insets(0, 0, 5, 5);
		gbc_paneImage.fill = GridBagConstraints.BOTH;
		gbc_paneImage.gridx = 0;
		gbc_paneImage.gridy = 0;
		getContentPane().add(paneImage, gbc_paneImage);
		paneImage.setLayout(new BorderLayout());
		
		JLabel lblPandocreonDivinae = new JLabel("<html><div style='text-align: center;'>PANDOCREON<br/>DIVINAE</div></html>");
		lblPandocreonDivinae.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblPandocreonDivinae.setHorizontalAlignment(JLabel.CENTER);
		lblPandocreonDivinae.setVerticalAlignment(JLabel.CENTER);
		paneImage.add(lblPandocreonDivinae, BorderLayout.CENTER);
		
//		try {
//			BufferedImage image = ImageIO.read(new File("res/jpeg/aube.jpg"));
//			BufferedImage rescaledImaged = new BufferedImage(1280, 720, BufferedImage.TYPE_INT_RGB);
//			rescaledImaged.getGraphics().drawImage(image, 0, 0, 1280,720,null);
//			ImageIcon icon = new ImageIcon(rescaledImaged);
//			JLabel img = new JLabel(icon);
//			paneImage.add(img);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
		JButton btnAide = new JButton("Aide");
		GridBagConstraints gbc_btnAide = new GridBagConstraints();
		gbc_btnAide.insets = new Insets(0, 0, 5, 0);
		gbc_btnAide.gridx = 1;
		gbc_btnAide.gridy = 1;
		getContentPane().add(btnAide, gbc_btnAide);
		
		JButton btnSortie = new JButton("Sortie");
		btnSortie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sortir();
			}
		});
		GridBagConstraints gbc_btnSortie = new GridBagConstraints();
		gbc_btnSortie.gridx = 1;
		gbc_btnSortie.gridy = 2;
		getContentPane().add(btnSortie, gbc_btnSortie);
		
		
		
	}

	public void sortir() {
		// TODO Auto-generated method stub
		dispose();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2740463141326011395L;
	

	public static void main(String[] args){
		FenetrePrincipale fenetre= new FenetrePrincipale();
		
		fenetre.setVisible(true);
		
	}
	
}
