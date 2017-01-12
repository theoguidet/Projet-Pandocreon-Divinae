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
import cartes.EvenementCarteType;
import cartes.croyant.Croyant;
import cartes.guideSpirituel.GuideSpirituel;
import controleur.test;
import joueurs.Joueur;
import joueurs.JoueurVirtuel;
import partie.Partie;
import propriete.Dogme;
import propriete.Origine;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import java.awt.event.MouseEvent;

public class VueCarte extends JPanel implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean couvert;
	private Image imageVerso;

	private Carte carteObjet;
	private boolean valideAChoisir;
	private boolean valideAJouer;
	private boolean valideASacrifier;

	public boolean isValideASacrifier() {
		return valideASacrifier;
	}

	public void setValideASacrifier(boolean valideASacrifier) {
		this.valideASacrifier = valideASacrifier;
	}

	public boolean isValideAJouer() {
		return valideAJouer;
	}

	public void setValideAJouer(boolean valideAJouer) {
		this.valideAJouer = valideAJouer;
	}

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
		this.carteObjet = carte1;
		VueCarte vue = this;
		couvert = carte1.getProprietaire() instanceof JoueurVirtuel;
		addMouseListener(new test(this));
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
		GridBagConstraints gbc = new GridBagConstraints();


		JPanel panelDogmes = new JPanel();
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(panelDogmes, gbc);
		panelDogmes.setOpaque(false);
		panelDogmes.setLayout(new BoxLayout(panelDogmes, BoxLayout.Y_AXIS));
		
		int sizePanelDogmes = (int) Math.round(colsRatio[0] / DoubleStream.of(colsRatio).sum() * this.getPreferredSize().getWidth());
		panelDogmes.setSize(sizePanelDogmes, sizePanelDogmes);

		JLabel lblNomDeCarte = new JLabel(nomDeCarte);
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(lblNomDeCarte, gbc);
		
		JLabel lblOrigine = new JLabel();
		gbc.insets = new Insets(0, 0, 5, 0);
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.FIRST_LINE_END;
		int widthLblOrigine = (int) Math.round(colsRatio[2] / DoubleStream.of(colsRatio).sum() * this.getPreferredSize().getWidth());
		int heightLblOrigine = (int) Math.round(rowsRatio[2] / DoubleStream.of(colsRatio).sum() * this.getPreferredSize().getHeight());
		lblOrigine.setSize(widthLblOrigine, heightLblOrigine);
		add(lblOrigine, gbc);


		JLabel lblTypeCarte = new JLabel(carte1.getTypeCarte().toString());
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 0;
		gbc.gridy = 1;
		lblTypeCarte.setUI(new VerticalLabelUI(false));
		add(lblTypeCarte, gbc);

		
		
		// lblCapacite.addMouseListener(new MouseAdapter() {
		// @Override
		// public void mouseClicked(MouseEvent e) {
		// if(vue.isValideAChoisir()){
		// vue.getCarteObjet().setChoisie();
		// }else if(vue.isValideAJouer()){
		// vue.getCarteObjet().setJouer();
		// vue.getCarteObjet().getProprietaire().jouerCarte(vue.getCarteObjet(),
		// Partie.getUniquePartie());
		// }
		// }
		// });
		JLabel lblCapacite = new JLabel("CAPACITE");
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 1;
		gbc.gridy = 1;
		lblCapacite.setToolTipText(carte1.getCapacite());
		add(lblCapacite, gbc);
		lblCapacite.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (vue.isValideAChoisir()) {
					vue.getCarteObjet().setChoisie();
					vue.getCarteObjet().getProprietaire().getMain().remove(vue.getCarteObjet());
				} else if (vue.isValideAJouer()) {
					ArrayList<Carte> carte = new ArrayList<Carte>();
					Joueur proprietaire = vue.getCarteObjet().getProprietaire();
					carte.add(carteObjet);
					if (proprietaire.verifierPointAction(carteObjet)) {
						vue.getCarteObjet().getProprietaire().jouerCarte(carte, Partie.getUniquePartie());
						vue.getCarteObjet().getProprietaire().getMain().remove(vue.getCarteObjet());
						proprietaire.enleverPointAction(carteObjet.getPropriete().getOrigine());
						vue.getCarteObjet().setJouer();
					}
				}
			}
		});

		JLabel lblNbCroyants = new JLabel();
		int widthLblNbCroyants = (int) Math.round(colsRatio[2] / DoubleStream.of(colsRatio).sum() * this.getPreferredSize().getWidth());
		int heightLblNbCroyants = (int) Math.round(rowsRatio[2] / DoubleStream.of(colsRatio).sum() * this.getPreferredSize().getHeight());
		lblNbCroyants.setSize(widthLblNbCroyants, heightLblNbCroyants);
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.LAST_LINE_END;
		add(lblNbCroyants, gbc);

		if (couvert) {
			try {
				BufferedImage imageVer = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("res/jpeg/" + "verso.jpg"));
				Dimension imageSize = new Dimension(imageVer.getWidth(), imageVer.getHeight());
				Dimension boundary = new Dimension(imageVer.getWidth(), imageVer.getHeight());
				Dimension dimensionPropre = calculerLeRapport(imageSize, boundary);
				ImageIcon icon = new ImageIcon(imageVer.getScaledInstance((int) dimensionPropre.getWidth(), (int) dimensionPropre.getHeight(), imageVer.SCALE_SMOOTH));
				JLabel label = new JLabel();
				label.setIcon(icon);
				this.add(label);
				setPreferredSize(new Dimension(24, 30));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			dessinerLeFond(carte1);
			dessinerOrigine(lblOrigine, carte1.getPropriete().getOrigine().toString());
			dessinerDogmes(panelDogmes, carte1);
			dessinerNbCroyant(lblNbCroyants, carte1);
			setPreferredSize(new Dimension(150, 180));
		}
		repaint();
	}

	private void dessinerDogmes(JPanel panelDogmes, Carte carte3) {
		ArrayList<Dogme> nbDogme = carte3.getPropriete().getDogmes();
		if (nbDogme != null) {
			try {
				BufferedImage imageDogme = null;
				for (Dogme dogme : nbDogme) {
					JLabel labelDogmes = new JLabel();
					imageDogme = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("res/jpeg/" + dogme.toString().toLowerCase() + ".jpg"));
					Dimension imageSize = new Dimension(imageDogme.getWidth(), imageDogme.getHeight());
					Dimension boundary = new Dimension(panelDogmes.getWidth(), panelDogmes.getHeight());
					Dimension dimensionPropre = calculerLeRapport(imageSize, boundary);
					ImageIcon icon = new ImageIcon(imageDogme.getScaledInstance((int) dimensionPropre.getWidth(), (int) dimensionPropre.getHeight(), imageDogme.SCALE_SMOOTH));
					labelDogmes.setIcon(icon);
					panelDogmes.add(labelDogmes);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * fonction de calculer le rapport
	 */
	public Dimension calculerLeRapport(Dimension imgSize, Dimension boundary) {

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
			EvenementCarte evenement = (EvenementCarte) arg1;
			if (evenement.getEvenement() == EvenementCarteType.EST_CHOISIE) {
				valideAChoisir = false;
				try {

					getParent().remove(this);
				} catch (NullPointerException e) {
					e.printStackTrace();
				}

			} else if (evenement.getEvenement() == EvenementCarteType.EST_JOUE) {
				valideAJouer = false;
				getParent().remove(this);
			}
		}
		super.repaint();
	}

	public void affichageRelle() {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the imageVerso
	 */
	public Image getImageVerso() {
		return imageVerso;
	}

	/**
	 * @param imageVerso
	 *            the imageVerso to set
	 */
	public void setImageVerso(Image imageVerso) {
		this.imageVerso = imageVerso;
	}

}
