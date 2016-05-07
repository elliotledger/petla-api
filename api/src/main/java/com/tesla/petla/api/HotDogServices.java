package com.tesla.petla.api;

import com.tesla.petla.api.type.HotDogPetWatcher;

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
		
		// Use Auth token hardcoded above or do we need to auth via API?
		
		// call petwatcher
		HotDogPetWatcher instance = HotDogPetWatcher.getInstance();
    	instance.startPetWatcher();
		
		// set 'petModeEnabled' to 'true' if the logic was successful 
		
		return false;
	}
	
	// method to return the status
	
	// method to exit pet mode
	
	
	
}
