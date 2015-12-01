import java.util.Scanner;
import vehicle.*;

public class Driving{

	public static void main(String [] args){
	
		Scanner in = new Scanner(System.in);
		Motorvehicle myVehicle = new Motorvehicle(0, " ");
		String make;
		String model;
		String vehicle;
		int cylinders;
		int doors;
		boolean isSet = false;
	
		while(!isSet){
			System.out.println("Please select a vehicle");
			System.out.println("1 - Car");
			System.out.println("2 - Motorcycle");
			System.out.println("3 - BigRig");
			// System.out.println("You have chosen a " + myVehicle.getVehicle() + " as your vehicle");
			int ans = in.nextInt(); 
			
			if(ans == 1){
				// vehicle = in.next();
				// myVehicle.setVehicle(vehicle);
				myVehicle = new Car();
				isSet = true;
			} else if(ans == 2){
				myVehicle = new Motorcycle();
				isSet = true;
			} else if (ans == 3){
				myVehicle = new Bigrig();
				isSet = true;
			}
		}
		
		System.out.println("Starting your vehicle");
		myVehicle.turnOn();
			
		while( myVehicle.isRun()){
			System.out.println("Your " + myVehicle.getVehicType() +" is running");
			System.out.println("Your vehicle is a " + myVehicle.getMake() + " " + myVehicle.getModel() );
			System.out.println("With " + myVehicle.getCylin() + " cylinders and " + " " + myVehicle.getDoors() + " " + " doors");
			System.out.println("What do you want to do with your vehicle?");
			System.out.println("0 - Turn vehicle off");
			System.out.println("1 - Change Make of Vehicle");
			System.out.println("2 - Change Model of Vehicle");
			System.out.println("3 - Change number of Cylinders");
			System.out.println("4 - Change number of Doors");
			int answer = in.nextInt();
			
			if(answer == 0){
				myVehicle.turnOff();
			} else if(answer == 1){
				System.out.println("New Make of Vehicle?");
				make = in.next();
				myVehicle.setMake(make);
			} else if(answer == 2){
				System.out.println("New Model of Vehicle");
				model = in.next();
				myVehicle.setModel(model);
			} else if(answer == 3){
				System.out.println("New Number of Cylinders");
				cylinders = in.nextInt();
				myVehicle.setCylin(cylinders);
			} else if(answer == 4){
				System.out.println("New Number of Doors");
				doors = in.nextInt();
				myVehicle.setDoors(doors);
			}
		}
	}
}