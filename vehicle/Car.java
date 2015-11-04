package vehicle;

public class Car{
	
	private boolean isRunning;
	
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
}