package vehicle;

public class Car{
	
	private boolean isRunning;
	private String make = "No Make";
	private String model = "No Model";
	private int cylinders = 0;
	private int doors = 0;
	private int numOfWheels = 4;
	private int numOfCyl = 6;
	private int numOfDoors = 4;
	
	public void Car(){
		isRunning = false;
	}
	
	public void turnOn(){
		isRunning = true;
	}
	
	public void turnOff(){
		isRunning = false;
	}
	
	public boolean isRun(){
		return isRunning;
	}
	
	public String getModel(){
		return model;
	}
	
	public String getMake(){
		return make;
	}
	
	public void setMake(String b){
		make = b;
	}
	
	public void setModel(String m){
		model = m;
	}
	
	public int getCylin(){
		return cylinders;
	}
	
	public int getDoors(){
		return doors;
	}
	
	public void setCylin(int c){
		cylinders = c;
	}
	
	public void setDoors(int d){
		doors = d;
	}
}