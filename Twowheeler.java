package week1.day1;

public class Twowheeler {
	
	// variables
	int noofwheels = 2;
	short noofmirrors = 2;
	long chassisnumbers = 102835355;
	boolean ispunctured = false;
	String bikeName = "Vespa";
	double runningKM = 20;
	
	// comments
	// method - actions / verifications
	// Twowheeler
	
	//access modifier, return type, methodName
	public void Twowheeler() {
		System.out.println(ispunctured); 
	    System.out.println(chassisnumbers);
	    System.out.println(bikeName);
	    System.out.println(runningKM);
	    System.out.println(noofmirrors);
	    System.out.println(noofwheels);
	           
	}
	
	
			
    //special method - main method
	public static void main(String[] args) {
		System.out.println("Inside main method");
		//create an object
		Twowheeler myTwowheeler = new Twowheeler();
		myTwowheeler.Twowheeler();
		
	
		// TODO Auto-generated method stub

	}

}
