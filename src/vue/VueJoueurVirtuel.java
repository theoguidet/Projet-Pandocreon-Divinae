package vue;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

import joueurs.Joueur;
import joueurs.JoueurVirtuel;
import java.awt.FlowLayout;
import java.awt.Font;

public class VueJoueurVirtuel extends VueJoueur {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6290901877213988762L;
	private JoueurVirtuel joueurVir;

	public VueJoueurVirtuel(JoueurVirtuel joueurVirtuel){
		setPreferredSize(new Dimension(150,150));
		setJoueurVir(joueurVirtuel);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWeights = new double[] { 0.1, 0.1};
		gridBagLayout.rowWeights = new double[] { 0.1, 0.2, 0.2 };
		setLayout(gridBagLayout);

		JLabel lblNomDuJoueur = new JLabel(joueurVirtuel.getNom());
		lblNomDuJoueur.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblNomDuJoueur = new GridBagConstraints();
//		gbc_lblNomDuJoueur.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomDuJoueur.gridx = 1;
		gbc_lblNomDuJoueur.gridy = 0;
		add(lblNomDuJoueur, gbc_lblNomDuJoueur);
		this.nomDuJoueur = lblNomDuJoueur;

		JLabel lblScore = new JLabel("Score" + joueurVirtuel.getNbPrieres());
		GridBagConstraints gbc_lblScore = new GridBagConstraints();
		gbc_lblScore.gridx = 0;
		gbc_lblScore.gridy = 1;
		add(lblScore, gbc_lblScore);
		

//		JLabel lblPointAction = new JLabel("PAJour:" + joueurVirtuel.getPointActionNuit() + "\n " + "PANuit:"
//				+ joueurVirtuel.getPointActionNuit() + "\n" + "PANeant:" + joueurVirtuel.getPointActionNeant());
//		GridBagConstraints gbc_lblPointAction = new GridBagConstraints();
//		gbc_lblPointAction.insets = new Insets(0, 0, 5, 5);
//		gbc_lblPointAction.gridx = 0;
//		gbc_lblPointAction.gridy = 2;
//		add(lblPointAction, gbc_lblPointAction);

		JPanel mainDuJoueur = new JPanel();
		mainDuJoueur.setLayout(new FlowLayout());
		GridBagConstraints gbc_mainDuJoueur = new GridBagConstraints();
		gbc_mainDuJoueur.fill = GridBagConstraints.BOTH;
		gbc_mainDuJoueur.gridx = 0;
		gbc_mainDuJoueur.gridy = 2;
//		gbc_mainDuJoueur.gridheight = 1;
		gbc_mainDuJoueur.gridwidth = 2;
		add(mainDuJoueur, gbc_mainDuJoueur);
		this.mainDuJoueur = mainDuJoueur;
//		mainDuJoueur.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}

	/**
	 * @return the joueurVir
	 */
	public JoueurVirtuel getJoueurVir() {
		return joueurVir;
	}

	/**
	 * @param joueurVir the joueurVir to set
	 */
	public void setJoueurVir(JoueurVirtuel joueurVir) {
		this.joueurVir = joueurVir;
	}

}
