package controleur;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import vue.VueCarte;

public class ControleurCarte extends MouseAdapter{
	private VueCarte vue;
	public ControleurCarte(VueCarte vueCarte){
		this.vue=vueCarte;
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(vue.isValideAChoisir()){
			vue.participerDansJeu();
		}
	}
}
