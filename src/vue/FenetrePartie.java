package vue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import controleur.ControleurPartie;
import joueurs.Joueur;
import joueurs.JoueurVirtuel;
import partie.Partie;


public class FenetrePartie extends JInternalFrame implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6651769382331271200L;
	/**
	 * Le controleur de partie actuelle.
	 */
	private ControleurPartie controleurPartie;
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

	public void setControleurPartie(ControleurPartie controleurPartie) {
		this.controleurPartie = controleurPartie;
	}
	/**
	 * demander nombre de Joueurs dans la partie
	 * @return
	 */
	public int demanderNbJoueurs() {
		// TODO Auto-generated method stub
		int nbJoueurs=0;
		String nbJoueur;
		boolean mauvaischoix =true;
		try{
		do{
			nbJoueur=JOptionPane.showInputDialog(this,"Combien de joueurs voulez-vous dans la partie?", "Nobmre de joueurs", JOptionPane.QUESTION_MESSAGE);
			nbJoueurs= Integer.parseInt(nbJoueur);
			if(nbJoueurs<2 || nbJoueurs>7){
				JOptionPane.showMessageDialog(this, "Le nombre de joueurs doit etre entre 2 et 7", "Nombre de joueurs", JOptionPane.WARNING_MESSAGE);
			}else{
				mauvaischoix=false;
			}
		}while(mauvaischoix);
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(this, "Le nombre de joueurs doit etre entier","Nombre de joueurs:",JOptionPane.WARNING_MESSAGE);
		}
		return nbJoueurs;
	}
	/**
	 * demander le nom du joueur physique
	 * @return
	 */
	public String demanderNomJoueurPhysique(){
		String nomJoueur;
			nomJoueur=JOptionPane.showInputDialog(this,"Entrez votre nom", "Nom du joueur physique", JOptionPane.QUESTION_MESSAGE);
		
		return nomJoueur;
		
	}
	/**
	 * demander list des noms des joueurs virtuels
	 * @param nbJoueurs
	 * @return
	 */
	public String[] demanderListNomJoueursVirtuel(int nbJoueurs) {
		// TODO Auto-generated method stub
		int indice=0;
		String[] nomJoueursVirtuel = new String[nbJoueurs-1];
		while(indice<=nbJoueurs-1){
			nomJoueursVirtuel[indice]= JOptionPane.showInputDialog(this,"Entrez le nom du joueur virtuel"+ indice, "Nom du joueur virtuel", JOptionPane.QUESTION_MESSAGE );
		}
		return nomJoueursVirtuel;
	}
	/**
	 * presenter les Joueurs dans la partie
	 */
	public void presenterJoueurs(){
		ArrayList<Joueur> listJoueur= Partie.getUniquePartie().getJoueurs();
		for(int indice=0; indice<=listJoueur.size();indice++){
			Joueur joueur= listJoueur.get(indice);
			if(joueur instanceof JoueurVirtuel){
				JOptionPane.showMessageDialog(this, joueur.getNom()+ "est à la position" + indice);
			}else{
				JOptionPane.showMessageDialog(this, "Vous etes à la position " +indice);
			}
		}
	}

	
	

}
