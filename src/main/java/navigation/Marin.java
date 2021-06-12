package navigation;

public  class Marin {  // dans le fichier Marin.java  
    
    private String nom ;  
    
    public Marin(String nom) {  
        this.nom = nom ;  
   }
    

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	@Override
	public String toString() {
		return "Mon objest de la classe Marin a pour nom:" + nom ;
	}  
}  
 
  