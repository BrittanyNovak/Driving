package vehicle;

public class Motorvehicle {
	
	private boolean isOff;
	private boolean isRunning;
	private String vehicle = "No Vehicle";
	private String make = "No Make";
	private String model = "No Model";
	private int cylinders = 0;
	private int doors = 0;
	private int numOfWheels = 0;
	private int numOfCyl = 0;
	private int numOfDoors = 0;
	private String vehicleType;
	
	public Motorvehicle(int num, String vType){
		isRunning = false;
		numOfWheels = num;
		vehicleType = vType;
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
	
	public boolean isVehicle(){
		return isOff;
	}
	
	public String getVehicType(){
		return vehicleType;
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