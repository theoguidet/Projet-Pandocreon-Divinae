package vue;

import joueurs.Joueur;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class VueJoueurPhysique extends VueJoueur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2191906756791527773L;

	private Joueur joueurObjet;
	private JTable table;

	public VueJoueurPhysique(Joueur joueurPhysique) {
		setMinimumSize(new Dimension(100, 100));
		joueurObjet= joueurPhysique;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWeights = new double[] { 0.1, 0.5,0.5,0.5,0.5,0.5,0.5,0.5};
		gridBagLayout.rowWeights = new double[] { 0.3, 0.3, 0.3};
		setLayout(gridBagLayout);

		JLabel lblNomDuJoueur = new JLabel(joueurPhysique.getNom());
		GridBagConstraints gbc_lblNomDuJoueur = new GridBagConstraints();
		gbc_lblNomDuJoueur.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomDuJoueur.gridx = 0;
		gbc_lblNomDuJoueur.gridy = 0;
		add(lblNomDuJoueur, gbc_lblNomDuJoueur);
		this.nomDuJoueur = lblNomDuJoueur;

		JLabel lblScore = new JLabel("Score" + joueurPhysique.getNbPrieres());
		GridBagConstraints gbc_lblScore = new GridBagConstraints();
		gbc_lblScore.insets = new Insets(0, 0, 5, 5);
		gbc_lblScore.gridx = 0;
		gbc_lblScore.gridy = 1;
		add(lblScore, gbc_lblScore);
		
//		JPanel panel = new JPanel();
//		GridBagConstraints gbc_panel = new GridBagConstraints();
//		gbc_panel.gridwidth = 1;
//		gbc_panel.insets = new Insets(0, 0, 5, 5);
//		gbc_panel.fill = GridBagConstraints.BOTH;
//		gbc_panel.gridx = 1;
//		gbc_panel.gridy = 1;
//		add(panel, gbc_panel);

		JLabel lblPointAction = new JLabel("PAJour:" + joueurPhysique.getPointActionNuit() + "\n " + "PANuit:"
				+ joueurPhysique.getPointActionNuit() + "\n" + "PANeant:" + joueurPhysique.getPointActionNeant());
		GridBagConstraints gbc_lblPointAction = new GridBagConstraints();
		gbc_lblPointAction.insets = new Insets(0, 0, 5, 5);
		gbc_lblPointAction.gridx = 0;
		gbc_lblPointAction.gridy = 2;
		add(lblPointAction, gbc_lblPointAction);

		JPanel mainDuJoueur = new JPanel();
		mainDuJoueur.setLayout(new FlowLayout());
		GridBagConstraints gbc_mainDuJoueur = new GridBagConstraints();
		gbc_mainDuJoueur.fill = GridBagConstraints.BOTH;
		gbc_mainDuJoueur.gridx = 1;
		gbc_mainDuJoueur.gridy = 2;
		gbc_mainDuJoueur.gridheight = 1;
		gbc_mainDuJoueur.gridwidth = 7;
		add(mainDuJoueur, gbc_mainDuJoueur);
		this.mainDuJoueur = mainDuJoueur;
		mainDuJoueur.setLayout(new FlowLayout());

	}

	public void rendreToutesLesCartesValideADefausser() {
		// TODO Auto-generated method stub
		for (int indice = 0; indice < mainDuJoueur.getComponentCount(); indice++) {
			((VueCarte) mainDuJoueur.getComponent(indice)).setValideAChoisir(true);
		}
	}
}
