import java.util.Scanner;
import vehicle.Car;

public class Driving{

	public static void main(String [] args){
	
		Scanner in = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		Car myCar = new Car();
		String make;
		String model;
		
			System.out.println("Starting your vehicle");
			myCar.turnOn();
			
		while( myCar.isRun()){
			System.out.println("Your car is running");
			System.out.println("Your vehicle is a " + myCar.getMake() + " " + myCar.getModel() );
			System.out.println("What do you want to do with your car?");
			System.out.println("0 - Turn car off");
			System.out.println("1 - Change Make of Vehicle");
			System.out.println("2 - Change Model of Vehicle");
			int answer = in.nextInt();
			
			if(answer == 0){
				myCar.turnOff();
			} else if(answer == 1){
				System.out.println("New Make of Vehicle?");
				make = keyboard.next();
				myCar.setMake(make);
			} else if(answer == 2){
				System.out.println("New Model of Vehicle");
				model = keyboard.next();
				myCar.setModel(model);
			}
		}
	}
}