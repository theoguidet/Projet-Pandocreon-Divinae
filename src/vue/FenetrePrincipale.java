package vue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import controleur.ControleurPartie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Font;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class FenetrePrincipale {

	private static FenetrePrincipale fenetrePrincipale;
	private JFrame frame = new JFrame();

	public JFrame getFrame() {
		return frame;
	}

	public static FenetrePrincipale getFenetrePrincipale() {
		return fenetrePrincipale;
	}

	public static void setFenetrePrincipale(FenetrePrincipale fenetrePrincipale) {
		FenetrePrincipale.fenetrePrincipale = fenetrePrincipale;
	}

	private JPanel overview = new JPanel();

	public FenetrePrincipale() {
		frame.getContentPane().setBackground(new Color(244, 164, 96));
		frame.setDefaultLookAndFeelDecorated(true);
		frame.setTitle("PANDOCREON DIVINAE");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setMinimumSize(new Dimension(640, 700));
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		overview = new JPanel();
		// overview.setForeground(Color.LIGHT_GRAY);
		// frame.setContentPane(overview);
		// overview.setVisible(true);
		GridBagLayout gbl_panneauBoutons = new GridBagLayout();
		overview.setLayout(gbl_panneauBoutons);
		overview.setOpaque(false);
		// getLayeredPane().setOpaque(false);
		// setJMenuBar(creerMenu());
		// getJMenuBar().setOpaque(true);
		// setRootPane(creerRootPane());
		JPanel paneImage = new JPanel();
		GridBagConstraints gbc_paneImage = new GridBagConstraints();
		gbc_paneImage.gridheight = 3;
		gbc_paneImage.insets = new Insets(0, 0, 5, 5);
		gbc_paneImage.fill = GridBagConstraints.BOTH;
		gbc_paneImage.gridx = 0;
		gbc_paneImage.gridy = 0;
		// rootPane.add(paneImage, gbc_paneImage);
		frame.getContentPane().add(paneImage, BorderLayout.WEST);
		paneImage.setLayout(new BorderLayout());

		JLabel lblPandocreonDivinae = new JLabel(
				"<html><div style='text-align: center;'>PANDOCREON<br/>DIVINAE</div></html>");
		lblPandocreonDivinae.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 36));
		lblPandocreonDivinae.setHorizontalAlignment(JLabel.CENTER);
		lblPandocreonDivinae.setVerticalAlignment(JLabel.CENTER);
		lblPandocreonDivinae.setBackground(new Color(244, 164, 96));
		lblPandocreonDivinae.setOpaque(true);
		paneImage.add(lblPandocreonDivinae, BorderLayout.EAST);

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWeights = new double[] { 0.7, 0.3 };
		gridBagLayout.rowWeights = new double[] { 0.1, 0.1, 0.1 };
		overview.setLayout(gridBagLayout);

		JButton btnPartie = new JButton("Partie");
		GridBagConstraints gbc_btnPartie = new GridBagConstraints();
		gbc_btnPartie.insets = new Insets(0, 0, 5, 0);
		gbc_btnPartie.gridx = 1;
		gbc_btnPartie.gridy = 0;
		overview.add(btnPartie, gbc_btnPartie);

		btnPartie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				(new ControleurPartie()).commencer();

			}
		});

		JButton btnAide = new JButton("Aide");
		GridBagConstraints gbc_btnAide = new GridBagConstraints();
		gbc_btnAide.insets = new Insets(0, 0, 5, 0);
		gbc_btnAide.gridx = 1;
		gbc_btnAide.gridy = 1;
		overview.add(btnAide, gbc_btnAide);

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
		overview.add(btnSortie, gbc_btnSortie);

		frame.getContentPane().add(overview, BorderLayout.EAST);

		JLabel lblNewLabel = new JLabel();
		try {
			BufferedImage myPicture = ImageIO
					.read(getClass().getClassLoader().getResourceAsStream("res/jpeg/" + "picture.jpg"));
			ImageIcon icon = new ImageIcon(
					myPicture.getScaledInstance(myPicture.getWidth(), myPicture.getHeight(), myPicture.SCALE_SMOOTH));
			lblNewLabel.setIcon(icon);
			lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
			lblNewLabel.setVerticalAlignment(JLabel.CENTER);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		frame.getContentPane().add(lblNewLabel, BorderLayout.CENTER);

		frame.getContentPane().addContainerListener(new ContainerListener() {

			@Override
			public void componentRemoved(ContainerEvent e) {
				// TODO Auto-generated method stub
				overview.setVisible(true);
				lblPandocreonDivinae.setVisible(true);
				lblNewLabel.setVisible(true);
			}

			@Override
			public void componentAdded(ContainerEvent e) {
				// TODO Auto-generated method stub
				overview.setVisible(false);
				lblPandocreonDivinae.setVisible(false);
				lblNewLabel.setVisible(false);
			}
		});
	}

	private JMenuBar creerMenu() {
		// TODO Auto-generated method stub
		JMenuBar menuBar = new JMenuBar();

		// Set up the lone menu.
		JMenu menu = new JMenu("Nouveau Jeu");
		menuBar.add(menu);

		// Set up the first menu item.
		JMenuItem menuItem = new JMenuItem("Nouvelle Partie");
		menuItem.setIcon(new ImageIcon("C:\\Users\\El kaiser&Blaze\\Desktop\\111.jpg"));
		menuItem.addActionListener(new ControleurPartie());
		menu.add(menuItem);

		// Set up the second menu item.
		menuItem_1 = new JMenuItem("Quit");
		menuItem_1.setBackground(Color.WHITE);
		menuItem_1.setIcon(new ImageIcon("C:\\Users\\El kaiser&Blaze\\Desktop\\exit.jpg"));
		menuItem_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sortir();
			}
		});
		menu.add(menuItem_1);

		return menuBar;
	}

	public void sortir() {
		// TODO Auto-generated method stub
		frame.dispose();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2740463141326011395L;
	private JMenuItem menuItem_1;

	public static void main(String[] args) {
		FenetrePrincipale fenetre = new FenetrePrincipale();
		fenetre.frame.setVisible(true);
		fenetrePrincipale = fenetre;
	}
}
