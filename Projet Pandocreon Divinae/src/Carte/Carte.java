package Carte;

import Joueur.Joueur;
import propriete.Propriete;
/**
 * La classe abstraite Carte représente une carte au sens large du jeu.
 * Elle est caractérisée par :
 * - un nom
 * - un type
 * - une capacité
 * - des propriétés
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
	 * méthode qui sera surchargée dans les classes filles
	 */
	public void utiliserCapacite(){}
	
	/**
	 * méthode qui permet un affichage formaté d'une carte
	 * @return l'affichage formaté avec le type, le nom, et la capacité.
	 */
	public String toString(){
		String def = "Type : " + typeCarte + "\n    Nom : " + nom + "\n    Capacité : " + capacite;
		return def;
	}
	
	/**
	 * getter des propriétés de la carte
	 * @return Les propriétés de la classe.
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
	 * getter de la description de la capacité de la carte
	 * @return la description de la capacité de la carte
	 */
	public String getCapacite() {
		return capacite;
	}
}
