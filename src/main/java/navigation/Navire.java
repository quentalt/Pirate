package navigation;

import java.util.ArrayList;
import java.util.List;

public class Navire {
	private List<Marin> equipage ;

	public Navire(List<Marin> equipage) {
		super();
		this.equipage = equipage;
	}

	public Navire() {
		super();
		this.equipage = new ArrayList<>();
	}

	public List<Marin> getEquipage() {
		return equipage;
	}

	public void setEquipage(List<Marin> equipage) {
		this.equipage = equipage;
	}
	
	public void ajoutMarin(Marin unMarin){
        this.equipage.add(unMarin);
    }
	
	
	

}
