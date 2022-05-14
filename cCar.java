package week1.day1;

public class cCar {
	
	public void applyBreak() {
		System.out.println("ApplyBreak");
		
	}
	
	public void switchonAC() {
		System.out.println("Switchon AC");
		
	}
	
	public void applyAccelerator() {
		System.out.println("Apply Accelerator");
		
	}
	
	public void applyGear() {
		System.out.println("Apply Gear");
	}
	

	public static void main(String[] args) {
		cCar mycCar = new cCar();
		mycCar.applyBreak();
		mycCar.switchonAC();
		mycCar.applyAccelerator();
		mycCar.applyGear();
		
		// TODO Auto-generated method stub

	}

}
