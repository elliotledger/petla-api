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
	
	public void startPetWatcher(){
		
		// all temp control logic goes in here in a loop
		
		while(watcherOn == true){
			
		}
		
		System.out.println("Pet watcher switched off.");
		
	}
	
}
