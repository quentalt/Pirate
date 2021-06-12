package navigation;

import java.util.List;
import static org.hamcrest.Matchers.emptyIterable;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.*;


public class Pirate extends Marin implements Piraterie {
	private double degreSauvagerie;
	private List<Pirate> Piraterie ;

	
	
	public Pirate(String nom, double degreSauvagerie) {
		super(nom);
		this.degreSauvagerie = degreSauvagerie;
	}
	
	public Pirate(double degreSauvagerie) {
		this("inconnu",degreSauvagerie);
	}
	

	public double getDegreSauvagerie() {
		return degreSauvagerie;
	}



	public void setDegreSauvagerie(double degreSauvagerie) {
		this.degreSauvagerie = degreSauvagerie;
	}
	
		
		   
	public void pillage() {
	
if (degreSauvagerie>50) {
		

	}
	
	}
	
	
	



			


			
			