package joueurs;

public enum EvenementJoueurType {
	/**
	 * ce joueur joue son tour
	 */
	JOUE_SON_TOUR,
	/**
	 * joue cartes
	 */
	JOUE_CARTES,
	/**
	 * defausse cartes
	 */
	DEFAUSSE_CARTES,
	/**
	 * sacrifie carte
	 */
	SACRIFIE_CARTE,
	/**
	 * calculer point action
	 */
	CALCULER_POINT_ACTION,
	/**
	 * victime
	 */
	VICTIME,
	/**
	 * finir
	 */
	FINIR_DEFAUSSER, 
	/**
	 * lancer de
	 */
	LANCERDE, 
	/**
	 * 
	 */
	NON_JOUER, 
	/**
	 * 
	 */
	CARTE_POSSIBLE, 
	/**
	 * 
	 */
	PRESENTER_MAIN,
	/**
	 * 
	 */
	PASSER_ACTION, PIOCHER_CARTE,
}
