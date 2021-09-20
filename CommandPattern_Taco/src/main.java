import java.util.Scanner;

import cheeseTaco.MXStyleCheeseTaco;
import cheeseTaco.StartCheeseTaco;
import veggieTaco.MXStyleVeggieTaco;
import veggieTaco.StartVeggieTaco;

public class main {

	public static void main(String[] args) {
		
		try {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "Press 1 for  CheeseTaco and 2 for VeggieTaco:" );
		int input = scanner.nextInt();
		System.out.println("Command Pattern Example");
	

		if(input == 1)
		{
			MXStyleCheeseTaco  cheese_taco = new MXStyleCheeseTaco( );
	        StartCheeseTaco test_cheeseTaco = new StartCheeseTaco(cheese_taco);
	        Taco cheesetaco_cmd = new Taco(test_cheeseTaco);    
	        cheesetaco_cmd.startTaco();
			
		}else if(input == 2)
		{
			MXStyleVeggieTaco  veggie_taco = new MXStyleVeggieTaco( );
			StartVeggieTaco test_veggietacop = new StartVeggieTaco(veggie_taco);
			Taco veggietaco_cmd = new Taco(test_veggietacop);   
			veggietaco_cmd.startTaco();
		}else {
			System.out.println("No sutiable Selection made");
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
