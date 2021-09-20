package veggieTaco;

import models.Command;

public class StartVeggieTaco implements Command {
	MXStyleVeggieTaco addsauce;
	


	public StartVeggieTaco(MXStyleVeggieTaco veggie_taco) {
		this.addsauce=veggie_taco;
	}

	@Override
	public void execute() {
		
		addsauce.preparing();
		addsauce.addingSauce();
		addsauce.addingtoppings();
		addsauce.packing();
	}

}
