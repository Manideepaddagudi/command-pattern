package cheeseTaco;

import models.Command;

public class StartCheeseTaco implements Command {
	
	MXStyleCheeseTaco addsauce;
	
	public StartCheeseTaco(MXStyleCheeseTaco addsauce) {
		this.addsauce=addsauce;
	}

	@Override
	public void execute() {
		
		addsauce.preparing();
		addsauce.addingSauce();
		addsauce.addingtoppings();
		addsauce.packing();
	}


}
