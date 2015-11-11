import java.util.Scanner;
import vehicle.Car;

public class Driving{

	public static void main(String [] args){
	
		Scanner in = new Scanner(System.in);
		Car myCar = new Car();
		String make;
		String model;
		int cylinders;
		int doors;
		
			System.out.println("Starting your vehicle");
			myCar.turnOn();
			
		while( myCar.isRun()){
			System.out.println("Your car is running");
			System.out.println("Your vehicle is a " + myCar.getMake() + " " + myCar.getModel() );
			System.out.println("With " + myCar.getCylin() + " cylinders and " + " " + myCar.getDoors() + " " + " doors");
			System.out.println("What do you want to do with your car?");
			System.out.println("0 - Turn car off");
			System.out.println("1 - Change Make of Vehicle");
			System.out.println("2 - Change Model of Vehicle");
			System.out.println("3 - Change number of Cylinders");
			System.out.println("4 - Change number of Doors");
			int answer = in.nextInt();
			
			if(answer == 0){
				myCar.turnOff();
			} else if(answer == 1){
				System.out.println("New Make of Vehicle?");
				make = in.next();
				myCar.setMake(make);
			} else if(answer == 2){
				System.out.println("New Model of Vehicle");
				model = in.next();
				myCar.setModel(model);
			} else if(answer == 3){
				System.out.println("New Number of Cylinders");
				cylinders = in.nextInt();
				myCar.setCylin(cylinders);
			} else if(answer == 4){
				System.out.println("New Number of Doors");
				doors = in.nextInt();
				myCar.setDoors(doors);
			}
		}
	}
}