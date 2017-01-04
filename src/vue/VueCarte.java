package vue;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.stream.DoubleStream;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

import cartes.Carte;
import cartes.EvenementCarte;
import cartes.TypeCarte;
import cartes.croyant.Croyant;
import cartes.guideSpirituel.GuideSpirituel;
import controleur.ControleurCarte;
import joueurs.JoueurVirtuel;
import cartes.EvenementCarteType;
import propriete.Dogme;
import propriete.Origine;

import javax.swing.JTextPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.BoxLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VueCarte extends JPanel implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean couvert;
	private Image imageVerso;

	private Carte carteObjet;
	private boolean valideAChoisir;

	public boolean isValideAChoisir() {
		return valideAChoisir;
	}

	public void setValideAChoisir(boolean valide) {
		this.valideAChoisir = valide;
	}

	/**
	 * construire la face de la carte
	 * 
	 * @param carte1
	 */
	public VueCarte(Carte carte1) {
		super();
		addMouseListener(new ControleurCarte(this));
		setPreferredSize(new Dimension(120, 180));
		this.carteObjet = carte1;
		couvert = carte1.getProprietaire() instanceof JoueurVirtuel;
		String nomDeCarte = carte1.getNom();
		carte1.addObserver(this);

		// JLabel label = new JLabel();
		// label.setSize(120, 200);
		// add(label);

		double[] colsRatio = new double[] { 0.2, 0.8, 0.2 };
		double[] rowsRatio = new double[] { 0.4, 0.4, 0.4 };

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWeights = colsRatio;
		gridBagLayout.rowWeights = rowsRatio;
		setLayout(gridBagLayout);

		JPanel panelDogmes = new JPanel();
		GridBagConstraints gbc_panelDogmes = new GridBagConstraints();
		gbc_panelDogmes.insets = new Insets(0, 0, 5, 5);
		gbc_panelDogmes.fill = GridBagConstraints.BOTH;
		gbc_panelDogmes.gridx = 0;
		gbc_panelDogmes.gridy = 0;
		add(panelDogmes, gbc_panelDogmes);
		panelDogmes.setOpaque(false);
		panelDogmes.setLayout(new BoxLayout(panelDogmes, BoxLayout.Y_AXIS));
		int sizePanelDogmes = (int) Math
				.round(colsRatio[0] / DoubleStream.of(colsRatio).sum() * this.getPreferredSize().getWidth());
		panelDogmes.setSize(sizePanelDogmes, sizePanelDogmes);

		JLabel lblNomDeCarte = new JLabel(nomDeCarte);
		GridBagConstraints gbc_lblNomDeCarte = new GridBagConstraints();
		gbc_lblNomDeCarte.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomDeCarte.gridx = 1;
		gbc_lblNomDeCarte.gridy = 0;
		add(lblNomDeCarte, gbc_lblNomDeCarte);
		JLabel lblOrigine = new JLabel();

		GridBagConstraints gbc_lblOrigine = new GridBagConstraints();
		gbc_lblOrigine.insets = new Insets(0, 0, 5, 0);
		gbc_lblOrigine.gridx = 2;
		gbc_lblOrigine.anchor = GridBagConstraints.FIRST_LINE_END;
		gbc_lblOrigine.gridy = 0;
		add(lblOrigine, gbc_lblOrigine);
		lblOrigine.setLayout(new FlowLayout());
		int widthLblOrigine = (int) Math
				.round(colsRatio[2] / DoubleStream.of(colsRatio).sum() * this.getPreferredSize().getWidth());
		int heightLblOrigine = (int) Math
				.round(rowsRatio[2] / DoubleStream.of(colsRatio).sum() * this.getPreferredSize().getHeight());
		lblOrigine.setSize(widthLblOrigine, heightLblOrigine);

		JLabel lblTypeCarte = new JLabel(carte1.getTypeCarte().toString());
		GridBagConstraints gbc_lblTypeCarte = new GridBagConstraints();
		gbc_lblTypeCarte.insets = new Insets(0, 0, 5, 5);
		gbc_lblTypeCarte.gridx = 0;
		gbc_lblTypeCarte.gridy = 1;
		lblTypeCarte.setUI(new VerticalLabelUI(false));
		add(lblTypeCarte, gbc_lblTypeCarte);

		JLabel lblCapacite = new JLabel("CAPACITE");
		GridBagConstraints gbc_lblCapacite = new GridBagConstraints();
		gbc_lblCapacite.insets = new Insets(0, 0, 5, 5);
		gbc_lblCapacite.gridx = 1;
		gbc_lblCapacite.gridy = 1;
		lblCapacite.setToolTipText(carte1.getCapacite());
		add(lblCapacite, gbc_lblCapacite);

		JLabel lblNbCroyants = new JLabel();
		int widthLblNbCroyants = (int) Math
				.round(colsRatio[2] / DoubleStream.of(colsRatio).sum() * this.getPreferredSize().getWidth());
		int heightLblNbCroyants = (int) Math
				.round(rowsRatio[2] / DoubleStream.of(colsRatio).sum() * this.getPreferredSize().getHeight());
		lblNbCroyants.setSize(widthLblNbCroyants, heightLblNbCroyants);
		GridBagConstraints gbc_lblNbCroyants = new GridBagConstraints();
		gbc_lblNbCroyants.gridx = 2;
		gbc_lblNbCroyants.gridy = 2;
		gbc_lblNbCroyants.anchor = GridBagConstraints.LAST_LINE_END;
		add(lblNbCroyants, gbc_lblNbCroyants);

		if (!couvert) {
			try {
				BufferedImage imageVer = ImageIO
						.read(this.getClass().getClassLoader().getResourceAsStream("res/jpeg/" + "verso.jpg"));
				Dimension imageSize = new Dimension(imageVer.getWidth(), imageVer.getHeight());
				Dimension boundary = new Dimension(imageVer.getWidth(), imageVer.getHeight());
				Dimension dimensionPropre = calculerLeRapport(imageSize, boundary);
				ImageIcon icon = new ImageIcon(imageVer.getScaledInstance((int) dimensionPropre.getWidth(),
						(int) dimensionPropre.getHeight(), imageVer.SCALE_SMOOTH));
				JLabel label = new JLabel();
				label.setIcon(icon);
				this.add(label);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			dessinerLeFond(carte1);
			dessinerOrigine(lblOrigine, carte1.getPropriete().getOrigine().toString());
			dessinerDogmes(panelDogmes, carte1);
			dessinerNbCroyant(lblNbCroyants, carte1);
		}

	}

	private void dessinerDogmes(JPanel panelDogmes, Carte carte3) {
		// TODO Auto-generated method stub
		ArrayList<Dogme> nbDogme;
		nbDogme = carte3.getPropriete().getDogmes();
		if (nbDogme != null) {
			try {
				BufferedImage imageDogme = null;
				for (int indice = 0; indice < nbDogme.size(); indice++) {
					JLabel labelDogmes = new JLabel();
					imageDogme = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("res/jpeg/"
							+ carte3.getPropriete().getDogmes().get(indice).toString().toLowerCase() + ".jpg"));
					ImageIcon icon = new ImageIcon(imageDogme.getScaledInstance(panelDogmes.getWidth(),
							panelDogmes.getWidth(), imageDogme.SCALE_SMOOTH));
					labelDogmes.setIcon(icon);
					panelDogmes.add(labelDogmes);

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * fonction de calculer le rapport
	 */
	public static Dimension calculerLeRapport(Dimension imgSize, Dimension boundary) {

		int original_width = imgSize.width;
		int original_height = imgSize.height;
		int bound_width = boundary.width;
		int bound_height = boundary.height;
		int new_width = original_width;
		int new_height = original_height;

		// first check if we need to scale width
		if (original_width > bound_width) {
			// scale width to fit
			new_width = bound_width;
			// scale height to maintain aspect ratio
			new_height = (new_width * original_height) / original_width;
		}

		// then check if we need to scale even with the new height
		if (new_height > bound_height) {
			// scale height to fit instead
			new_height = bound_height;
			// scale width to maintain aspect ratio
			new_width = (new_height * original_width) / original_height;
		}

		return new Dimension(new_width, new_height);
	}

	/**
	 * dessiner l'image nombre de Croyant
	 * 
	 * @param lblNbCroyants
	 * @param carte2
	 */
	private void dessinerNbCroyant(JLabel lblNbCroyants, Carte carte2) {
		// TODO Auto-generated method stub
		int nbr;
		if (carte2 instanceof Croyant) {
			nbr = ((Croyant) carte2).getNbCroyants();
		} else if (carte2 instanceof GuideSpirituel) {
			nbr = ((GuideSpirituel) carte2).getNbCroyants();
		} else {
			nbr = 0;
		}
		if (nbr != 0) {
			try {
				BufferedImage imageOrigine = ImageIO.read(
						this.getClass().getClassLoader().getResourceAsStream("res/jpeg/" + "nbr_" + nbr + ".jpg"));
				Dimension imageSize = new Dimension(imageOrigine.getWidth(), imageOrigine.getHeight());
				Dimension boundary = new Dimension(lblNbCroyants.getWidth(), lblNbCroyants.getHeight());
				Dimension dimensionPropre = calculerLeRapport(imageSize, boundary);
				ImageIcon icon = new ImageIcon(imageOrigine.getScaledInstance((int) dimensionPropre.getWidth(),
						(int) dimensionPropre.getHeight(), imageOrigine.SCALE_SMOOTH));
				lblNbCroyants.setIcon(icon);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * dessiner l'image de l'Origine de la carte
	 * 
	 * @param lblOrigine
	 * @param origine
	 */
	private void dessinerOrigine(JLabel lblOrigine, String origine) {
		// TODO Auto-generated method stub
		if (origine != Origine.NULL.toString()) {
			try {
				BufferedImage imageOrigine = ImageIO.read(this.getClass().getClassLoader()
						.getResourceAsStream("res/jpeg/" + origine.toLowerCase() + ".jpg"));
				Dimension imageSize = new Dimension(imageOrigine.getWidth(), imageOrigine.getHeight());
				Dimension boundary = new Dimension(lblOrigine.getWidth(), lblOrigine.getHeight());
				Dimension dimensionPropre = calculerLeRapport(imageSize, boundary);
				ImageIcon icon = new ImageIcon(imageOrigine.getScaledInstance((int) dimensionPropre.getWidth(),
						(int) dimensionPropre.getHeight(), imageOrigine.SCALE_SMOOTH));
				lblOrigine.setIcon(icon);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * dessiner le fond de la carte
	 * 
	 * @param carteAConsiderer
	 */
	private void dessinerLeFond(Carte carteAConsiderer) {
		switch (carteAConsiderer.getTypeCarte()) {
		case croyant:
			setBackground(new Color(192, 192, 192));
			break;
		case guideSpirituel:
			setBackground(new Color(128, 128, 128));
			break;
		case divinite:
			setBackground(new Color(105, 105, 105));
			break;
		case apocalyspe:
			setBackground(new Color(220, 20, 60));
			break;
		default:
			setBackground(new Color(255, 165, 0));
			break;
		}

	}

	/**
	 * 
	 */
	public void participerDansJeu() {
		Carte carte = this.getCarteObjet();
		carte.getProprietaire();
	}

	public Carte getCarteObjet() {
		return carteObjet;
	}

	public void setCarteObjet(Carte carteObjet) {
		this.carteObjet = carteObjet;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		if (arg1 != null) {
			if (arg1 instanceof EvenementCarte) {
				EvenementCarte evenement = (EvenementCarte) arg1;
				if (evenement.getEvenement() == EvenementCarteType.EST_CHOISIE) {
					valideAChoisir = false;
					getParent().remove(this);
				}
			}
		}

	}
}
