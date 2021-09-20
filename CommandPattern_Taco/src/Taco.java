import models.Command;

public class Taco {
	
	 private Command prepareTacos;
     public Taco(Command preparing) {
    	 this.prepareTacos = preparing;
    
     }

     void startTaco( ) {
    	 this.prepareTacos . execute ( ) ;                           
     }
  
   
}
