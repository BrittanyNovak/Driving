package vehicle;

public class Motorcycle{
	
	private boolean canRun;
	private String make = "No Make";
	private String model = "No Model";
	private int cylinders = 0;
	private int doors = 0;
	private int numOfWheels = 2;
	private int numOfCyl = 2;
	private int numOfDoors = 0;
	
	public void Motorcycle(){
		canRun = false;
	}
	
	public void turnOn(){
		canRun = true;
	}
	
	public void turnOff(){
		canRun = false;
	}
	
	public boolean isRun(){
		return canRun;
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