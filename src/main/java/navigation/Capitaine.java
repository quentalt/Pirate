package navigation;

public  class Capitaine  extends Marin {  // dans le fichier Capitaine.java  
    
    private String grade ; 
     
    public Capitaine(String nom, String grade) {  
        super(nom) ;  // appel du constructeur de la super classe  
        this.grade = grade ;  
   }  
     
    public Capitaine(String grade) {  
        this("ind�fini", grade) ;  // appel du constructeur de m�me classe  
   }  
    
    
    
    
}