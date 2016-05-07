package com.tesla.petla.api;

public class HotDogServices {

	
	private static HotDogServices instance = null;
	
	protected HotDogServices() {
	      // Exists only to defeat instantiation.
	}
	
	public static HotDogServices getInstance() {
	      if(instance == null) {
	         instance = new HotDogServices();
	      }
	      return instance;
	}
	
	
	private String teslaAuthToken = "thisIsAnAuthToken12324";
	private boolean petModeEnabled = false;
	
	public boolean enablePetMode (){
		
		// Use Auth token hardcoded above
		
		// do the logic here
		
		// ?? create a singleton instance of handler and let it run ??
		
		// set 'petModeEnabled' to 'true' if the logic was successful 
		
		return false;
	}
	
	// method to return the status
	
	// method to exit pet mode
	
	
	
}
