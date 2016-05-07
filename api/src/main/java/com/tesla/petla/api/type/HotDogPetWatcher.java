package com.tesla.petla.api.type;


public class HotDogPetWatcher {

private static HotDogPetWatcher instance = null;
	
	protected HotDogPetWatcher() {
	      // Exists only to defeat instantiation.
	}
	
	public static HotDogPetWatcher getInstance() {
	      if(instance == null) {
	         instance = new HotDogPetWatcher();
	      }
	      return instance;
	}
	
	private boolean watcherOn = true;
	private String teslaAuthToken = "thisIsAnAuthToken12324";
	
	public void startPetWatcher(){
		
		// all temp control logic goes in here in a loop
		
		while(watcherOn == true){
			
		}
		
		System.out.println("Pet watcher switched off.");
		
	}
	
	public boolean stopPetWatcher(){
		
		if(watcherOn == true){
			this.watcherOn = false;
		}
		
		return true;
	}

	// Getters and Setters
	
	public void setTeslaAuthToken(String teslaAuthToken) {
		this.teslaAuthToken = teslaAuthToken;
	}
	
}
