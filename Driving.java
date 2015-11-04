import java.util.Scanner;
import vehicle.Car;

public class Driving{

	public static void main(String [] args){
	
		Scanner in = new Scanner(System.in);
		Car myCar = new Car();
		myCar.turnOn();
		
		while( myCar.isRun()){
			System.out.println("Your car is running");
			System.out.println("What do you want to do with your car?");
			System.out.println("0 - Turn car off");
			int answer = in.nextInt();
			
			if(answer == 0){
				myCar.turnOff();
			}
		}
	}
}