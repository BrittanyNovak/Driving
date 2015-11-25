import java.util.Scanner;
import vehicle.Motorcycle;

public class Driving{

	public static void main(String [] args){
	
		Scanner in = new Scanner(System.in);
		Motorcycle myMotor = new Motorcycle();
		String make;
		String model;
		int cylinders;
		int doors;
		
			System.out.println("Starting your vehicle");
			myMotor.turnOn();
			
		while( myMotor.isRun()){
			System.out.println("Your motorcycle is running");
			System.out.println("Your vehicle is a " + myMotor.getMake() + " " + myMotor.getModel() );
			System.out.println("With " + myMotor.getCylin() + " cylinders and " + " " + myMotor.getDoors() + " " + " doors");
			System.out.println("What do you want to do with your motorcycle?");
			System.out.println("0 - Turn motorcycle off");
			System.out.println("1 - Change Make of Vehicle");
			System.out.println("2 - Change Model of Vehicle");
			System.out.println("3 - Change number of Cylinders");
			System.out.println("4 - Change number of Doors");
			int answer = in.nextInt();
			
			if(answer == 0){
				myMotor.turnOff();
			} else if(answer == 1){
				System.out.println("New Make of Vehicle?");
				make = in.next();
				myMotor.setMake(make);
			} else if(answer == 2){
				System.out.println("New Model of Vehicle");
				model = in.next();
				myMotor.setModel(model);
			} else if(answer == 3){
				System.out.println("New Number of Cylinders");
				cylinders = in.nextInt();
				myMotor.setCylin(cylinders);
			} else if(answer == 4){
				System.out.println("New Number of Doors");
				doors = in.nextInt();
				myMotor.setDoors(doors);
			}
		}
	}
}