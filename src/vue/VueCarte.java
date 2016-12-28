package vue;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import cartes.Carte;
import joueurs.JoueurVirtuel;

import javax.swing.JTextPane;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class VueCarte extends JPanel implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	
	private Carte carte;
	private JPanel imageRepresetative;
	private JPanel imageVerso;
	private boolean couvert;
	public VueCarte(Carte carte1) {
		super();
		this.carte=carte1;
		couvert= carte1.getProprietaire() instanceof JoueurVirtuel;
		 carte1.addObserver(this);
		 GridBagLayout gridBagLayout = new GridBagLayout();
		 gridBagLayout.columnWidths = new int[]{194, 61, 0};
		 gridBagLayout.rowHeights = new int[]{20, 0};
		 gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		 gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		 setLayout(gridBagLayout);
		
	}
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}
