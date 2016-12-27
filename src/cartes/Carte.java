package cartes;

import joueurs.Joueur;
import propriete.Propriete;
/**
 * La classe abstraite Carte repr�sente une carte au sens large du jeu.
 * Elle est caract�ris�e par :
 * - un nom
 * - un type
 * - une capacit�
 * - des propri�t�s
 * @author Admin
 *
 */

public abstract class Carte {
	protected String nom;
	protected TypeCarte typeCarte;
	protected String capacite;
	protected boolean estDistribuee;
	protected Propriete propriete;
	private boolean estSacrifier=false;
	private boolean dansLaMain;
	
	
	public boolean isDansLaMain() {
		return dansLaMain;
	}

	public void setDansLaMain(boolean dansLaMain) {
		this.dansLaMain = dansLaMain;
	}

	public void setTypeCarte(TypeCarte typeCarte) {
		this.typeCarte = typeCarte;
	}

	public boolean isEstSacrifier() {
		return estSacrifier;
	}

	public void setEstSacrifier(boolean estSacrifier) {
		this.estSacrifier = estSacrifier;
	}

	/*
	 * proprietaire de la carte
	 */
	private Joueur proprietaire;
	public Joueur getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Joueur proprietaire) {
		this.proprietaire = proprietaire;
	}

	/*
	 * id Carte
	 */
	private int idCarte;
	
	public int getIdCarte() {
		return idCarte;
	}

	public void setIdCarte(int idCarte) {
		this.idCarte = idCarte;
	}

	/**
	 * Constructeur de la classe
	 */
	public Carte(){
		this.estDistribuee = false;
	}
	
	/**
	 * m�thode qui sera surcharg�e dans les classes filles
	 */
	public void utiliserCapacite(){}
	
	/**
	 * m�thode qui permet un affichage format� d'une carte
	 * @return l'affichage format� avec le type, le nom, et la capacit�.
	 */
	public String toString(){
		String def = "Type : " + typeCarte + "\n    Nom : " + nom + "\n    Capacit� : " + capacite;
		return def;
	}
	
	/**
	 * getter des propri�t�s de la carte
	 * @return Les propri�t�s de la classe.
	 */
	public Propriete getPropriete() {
		return propriete;
	}

	/**
	 * getter du nom de la carte
	 * @return le nom de la carte
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * getter du type de carte
	 * @return le type de carte
	 */
	public TypeCarte getTypeCarte() {
		return typeCarte;
	}

	/**
	 * getter de la description de la capacit� de la carte
	 * @return la description de la capacit� de la carte
	 */
	public String getCapacite() {
		return capacite;
	}
}
